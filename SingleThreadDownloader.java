import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * J-Downloader Ver 0.1 - 单线程原生下载器
 * 目标：理解网络流 (InputStream) 到文件流 (FileOutputStream) 的搬运过程
 */
public class SingleThreadDownloader {

    public static void main(String[] args) {
        // 1. 找一个测试链接 (这里用 Google 的 Logo，或者你自己找个图片链接)
        String fileUrl = "https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png";
        // 2. 存到哪里？(存到当前项目根目录，名字叫 google.png)
        String savePath = "baidu.png";

        System.out.println("⏳ 开始下载...");
        download(fileUrl, savePath);
    }

    public static void download(String urlPath, String targetPath) {
        // 考点1：为什么要把流定义在 try() 的括号里？
        // 答：这是 Java 7 的 try-with-resources 语法。
        // 括号里的资源（InputStream, FileOutputStream）会在代码运行完后【自动关闭】。
        // 以前我们要自己在 finally 里写 conn.disconnect() 和 stream.close()，很容易忘。

        HttpURLConnection connection = null;
        try {
            // 1. 建立连接
            URL url = new URL(urlPath);//实例化URL对象
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); // 5秒连不上就报错
            connection.setReadTimeout(5000);    // 5秒读不到数据就报错

            // 检查服务器响应码 (200 代表 OK)
            if (connection.getResponseCode() == 200) {
                System.out.println("✅ 连接服务器成功，文件大小: " + connection.getContentLength() + " bytes");

                // 2. 获取输入流 (从网络读数据)
                try (InputStream in = connection.getInputStream();
                     // 3. 获取输出流 (往硬盘写数据)
                     FileOutputStream out = new FileOutputStream(targetPath)) {

                    // 考点2：缓冲区 (Buffer)
                    // 就像搬砖，你不能一块一块搬（byte by byte），要用小推车（buffer array）。
                    // 这里定义一个 1KB 的缓冲区
                    byte[] buffer = new byte[1024];
                    int len;

                    // 循环读取：in.read(buffer) 会把数据填进小推车，并返回填了多少(len)
                    while ((len = in.read(buffer)) != -1) {
                        // 把小推车里的数据倒进硬盘
                        out.write(buffer, 0, len);
                    }
                    System.out.println("🎉 下载完成！文件已保存到: " + targetPath);
                }
            } else {
                System.out.println("❌ 下载失败，服务器响应码: " + connection.getResponseCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 即使 try-with-resources 关闭了流，连接对象本身最好手动断开
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
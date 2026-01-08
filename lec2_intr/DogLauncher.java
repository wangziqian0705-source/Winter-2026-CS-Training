package lec2_intr;
import java.util.Scanner;

public class DogLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog d;
        d = new Dog();

        System.out.print("请输入狗的体重: ");
        if (scanner.hasNextInt()) {
            d.weightInPounds = scanner.nextInt();
            d.makeNoise();
        }
        Dog maya = new Dog();
        Dog yusuf = new Dog();
        System.out.println("请输入另外两条狗的体重");
        if (scanner.hasNextInt()) {
            maya.weightInPounds = scanner.nextInt();
            yusuf.weightInPounds = scanner.nextInt();
            Dog larger = Dog.MaxDog(maya, yusuf);
            larger.makeNoise();
           System.out.println("修改 larger 的体重前，maya 的体重是: " + maya.weightInPounds);

           larger.weightInPounds = 500;

           System.out.println("修改后，maya 的体重是: " + maya.weightInPounds);
        }
        {
            // 1. 先造出包含 10 个“格位”的数组（此时全是 null）
            Dog[] dogs = new Dog[10];

            System.out.println("准备录入 10 只狗的体重：");
            for (int i = 0; i < dogs.length; i++) {
                if (scanner.hasNextInt()) {
                    // 2. 关键：先 new 出一只狗，并把它存进数组的格子里
                    dogs[i] = new Dog();
                    // 3. 再修改这个格子里指向的那只狗的体重
                    dogs[i].weightInPounds = scanner.nextInt();
                }
            }

            // 4. 调用你刚才写的那个硬核算法：找出所有“局部最重”的狗
            Dog[] winners = Dog.largerThanFourNeighbors(dogs);

            System.out.println("符合『前后四邻最重』条件的狗有：");
            for (Dog w : winners) {
                if (w != null) {
                    System.out.print(w.weightInPounds + " 磅：");
                    w.makeNoise();
                }
            }
        }
        scanner.close();
    }
}
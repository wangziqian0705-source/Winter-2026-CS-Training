import java.util.ArrayList;
    public class TestArrayList {
        public static void main(String[] args) {
            // 创建一个空列表
            ArrayList<Integer> list = new ArrayList<>();
            // 疯狂添加数据，触发扩容
            for (int i = 0; i < 20; i++) {
                list.add(i);
            }
        }
    }
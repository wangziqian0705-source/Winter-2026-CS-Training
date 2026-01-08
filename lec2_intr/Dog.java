package lec2_intr;

public class Dog {
    public int weightInPounds;

    public Dog() {
    }

    public static Dog MaxDog(Dog maya, Dog yusuf){
        return maya;
    }

    public void makeNoise() {
        if (weightInPounds <= 10) System.out.println("yipyipyip.");
        else if (weightInPounds <= 30) System.out.println("bark!");
        else System.out.println("aroooooooo!");
    }

    /** 核心逻辑：判断当前狗是否是前后各两只（共4只）邻居中最重的 */
    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        for (int j = i - 2; j <= i + 2; j++) {
            if (i == j) continue; // 不用跟自己比
            // 边界检查：如果索引在数组范围内
            if (j >= 0 && j < dogs.length) {
                if (dogs[j].weightInPounds >= dogs[i].weightInPounds) {
                    return false; // 只要有一个邻居比我重（或一样重），我就不是最靓的仔
                }
            }
        }
        return true;
    }

    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (isBiggestOfFour(dogs, i)) {
                returnDogs[cnt] = dogs[i];
                cnt++;
            }
        }
        return returnDogs;
    }

    public static void main(String[] args) {
    }
}
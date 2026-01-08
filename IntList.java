package lec3_lists1;

public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f,IntList r){
        first = f;
        rest = r;
    }

    public int size(){
        if(rest == null){
            return 1;
        }
        return rest.size() + 1;
    }
    public static void main(String[] args){
        IntList L = new IntList(15,null);
        L = new IntList(10,L);
        L = new IntList(5,L);
        L = new IntList(5,L);
        System.out.println(L.size());
        IntList p = L; // 拷贝 L 的地址位
        while (p != null) {
            System.out.print(p.first);
            if (p.rest != null) {
                System.out.print(" -> ");
            }
            p = p.rest; // 灵魂：把 p 移向下一个节点的地址
        }
    }
}

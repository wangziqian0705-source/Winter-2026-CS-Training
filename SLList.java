package lec3_lists1;

public class SLList {

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int f, IntNode r){
            item = f;
            next = r;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(666, null); // 哨兵值随便写
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(666, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addFirst(10);

        IntNode p = L.sentinel.next;
        while (p != null) {
            System.out.print(p.item);
            if (p.next != null) {
                System.out.print(" -> ");
            }
            p = p.next;
        }
    }
}
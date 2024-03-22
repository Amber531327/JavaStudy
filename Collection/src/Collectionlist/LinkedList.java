package Collectionlist;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> queue=new java.util.LinkedList<>();
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        System.out.println("---------------------");
        java.util.LinkedList<String> stack=new java.util.LinkedList<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}

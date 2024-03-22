package Middle.addTwoNumbers;

public class test {
    public static void main(String[] args) {
        ListNode l3=new ListNode(3);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(6, l2);

        ListNode l6=new ListNode(3);
        ListNode l5 = new ListNode(2, l6);
        ListNode l4 = new ListNode(6, l5);

        AddTwoNumbers2 test=new AddTwoNumbers2();
        ListNode t1=test.addTwoNumbers(l1,l4);
        while (t1!=null){
            System.out.println(t1.val);
            t1=t1.next;
        }

    }
}

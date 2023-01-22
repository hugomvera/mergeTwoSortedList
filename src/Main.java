import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ListNode ls1 = new ListNode();
        ls1.val = -9 ;
//
        ls1.next = new ListNode();
        ls1.next.val = 3;
//
//        ls1.next.next = new ListNode();
//        ls1.next.next.val = 4;


        ListNode ls2 = new ListNode();
        ls2.val = 5 ;
//
        ls2.next = new ListNode();
        ls2.next.val = 7;
//
//        ls2.next.next = new ListNode();
//        ls2.next.next.val = 4;


        Solution sl = new Solution();
        ls1 =sl.mergeTwoLists(ls1,ls2);

        while(ls1 != null){
            System.out.println(ls1.val);
            ls1 = ls1.next;
        }




    }


}
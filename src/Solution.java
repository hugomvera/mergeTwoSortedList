class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //this is if both are nulls
        if(list1==null && list2 ==null){
            return list1;
        }

        //if one is null then pass the next
        if(list1==null ){
            return list2;
        }

        //if one is null then pass next
        if(list2==null ){
            return list1;
        }
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode merged ;
        merged= new ListNode();
        ListNode mergedHead = merged;

        System.out.println(merged);
        System.out.println(mergedHead);


        while(t1 != null | t2 !=null ){


            if(t1!=null){System.out.println("\tt1 is:"+t1.val);}
            else {
                System.out.println("t1 is null" );
            }
            if(t2!=null){System.out.println("\tt2 is "+ t2.val);}
            else {
                System.out.println("t2 is null" );
            }

            if(t1!=null){
                System.out.println("t1 is not null");
            }

            if(t1== null & t2!=null){
                System.out.println("t1 is null");
                System.out.println("and t2 is not null");
            }

            if(t1!=null){
            if(t1!=null & t2 ==null || t1.val <= t2.val ){
                   System.out.println("\t\tCondition A");
                   System.out.println("\t\t\tstoring \t"+ t1.val);
                   merged.val = t1.val;
                   t1 =t1.next;


                System.out.println("\t\tmaking a new ListNode for next");
                if(t2==null & t1==null){
                    return mergedHead;
                }
                merged.next = new ListNode();
                merged = merged.next;

                   continue;
            }}
            if(t2!=null){
            if(t2!=null & t1==null|| t1.val > t2.val ) {
                System.out.println("\t\tCondition B");


                System.out.println("\t\t\tstoring \t"+ t2.val);
                merged.val = t2.val;


                t2 = t2.next;
                System.out.println("\t\tmaking a new ListNode for next");
                if(t2==null & t1==null){
                    return mergedHead;
                }
                merged.next = new ListNode();
                merged = merged.next;
                continue;
            }}



        }

//        System.out.println("in t2");
//        while(t2 != null ){
//            System.out.println(t2.val);
//            t2 = t2.next;
//        }
//



        return mergedHead ;
    }
}
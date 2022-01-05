public class ReverseLists {
    public ListNode reverseList(ListNode head) {
        ListNode head1=new ListNode(0);

        ListNode curr;
        curr=head;
        ListNode temp;

        while (curr.next!=null){
            temp=head1.next;

            head1.next=curr;
            head1.next.next=temp;
            curr=curr.next;




        }
        return head1.next;


    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode curr=head;
        ListNode temp;
        ListNode curr1;
        if (head.next==null){
            return  head;
        }
        while (true){
            if (curr.next.val==left){
                ListNode reverseList;

                curr1=curr.next;
                ListNode pre=curr1;
                reverseList=curr;

                while (curr1.next.val!=right){
                    temp=curr1.next;
                    curr1.next=reverseList.next;
                    reverseList.next=curr1;
                    curr1=temp;

                }
                pre.next=curr1;
                break;

            }

            curr=curr.next;
        }
        return head;


    }
}

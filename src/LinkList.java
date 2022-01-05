//public class LinkList {
//    public static void main(palindrome[] args) {
//        HeroNode h1=new HeroNode(1,"松江");
//        HeroNode h2=new HeroNode(2,"松江2");
//        HeroNode h3=new HeroNode(3,"松江3");
//        HeroNode h4=new HeroNode(3,"haha");
//        LinkList linkList1=new LinkList();
//        linkList1.change(h1);
//        linkList1.addByOrder(h1);
//        linkList1.addByOrder(h3);
//        linkList1.addByOrder(h2);
//        linkList1.change(h4);
//        linkList1.showNode();
//
//
//
//    }
//    private HeroNode headNode=new HeroNode(0,"");
//    public void addNode(HeroNode heroNode){
//        HeroNode temp=new HeroNode();
//        temp=headNode;
//        while (true){
//            if (temp.next==null){
//                break;
//            }
//
//            temp=temp.next;
//        }
//        temp.next=heroNode;
//
//    }
//    public void showNode(){
//        HeroNode temp=headNode.next;
//        if (headNode.next==null){
//            System.out.println("数组为空");
//            return;
//        }
//        while (true){
//            if (temp==null){
//                break;
//            }
//            System.out.println(temp);
//            temp=temp.next;
//        }
//    }
//    public void addByOrder(HeroNode heroNode) {
//        HeroNode temp = headNode;
//        boolean flag=false;
//
//
//        while (true){
//            if (temp.next==null){
//                break;
//            }
//            if (temp.next.num>heroNode.num){
//
//                break;
//            }
//            if (temp.next.num==heroNode.num){
//                flag=true;
//                break;
//            }
//            temp=temp.next;
//        }
//        if (flag){
//            System.out.println("成员已存在，不能添加");
//
//        }else {
//            heroNode.next=temp.next;
//            temp.next=heroNode;
//        }
//
//
//
//
//    }
//    public void change(HeroNode heroNode){
//        HeroNode temp=new HeroNode();
//        temp=headNode;
//        if (temp.next==null){
//            System.out.println("数组为空");
//            return;
//        }
//        while (true){
//            if (temp==null){
//                System.out.println("不存在");
//                break;
//            }
//            if (temp.num==heroNode.num){
//                temp.name=heroNode.name;
//                break;
//            }
//            temp=temp.next;
//        }
//
//
//    }
//    public void delete(){
//
//
//    }
//
//
//}
//class HeroNode{
//    public int num;
//    public palindrome name;
//    public HeroNode next;
//
//    public HeroNode(int num, palindrome name) {
//        this.num = num;
//        this.name = name;
//
//    }
//
//    public HeroNode() {
//    }
//
//    @Override
//    public palindrome toString() {
//        return "HeroNode{" +
//                "num=" + num +
//                ", name='" + name + '\''  +
//                '}';
//    }
//}
public class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        this.size=0;
        head=new ListNode(0);

    }

    public int get(int index) {
        ListNode curr=head;
        if (index<0||index>=size){
            return -1;
        }
        for (int i=0;i<index+1;i++){
            curr=curr.next;
        }
        return curr.val;


    }

    public void addAtHead(int val) {


    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {
        ListNode curr=head;
        ListNode add=new ListNode(val);
        if (index>size){
            return;
        }
        for (int i=0;i<index;i++){
            curr=curr.next;
        }
        add.next=curr.next;
        curr.next=add;
        size++;


    }

    public void deleteAtIndex(int index) {

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public ListNode removeElements(ListNode head, int val) {
    ListNode curr;
    while (head.val==val){
        head=head.next;
    }
    curr=head;
   while (curr.next!=null){
       if(curr.next.val==val){
           curr.next=curr.next.next;
       }
       curr=curr.next;
       c
   }
   return head;


}
public class CirList {
    public static void main(palindrome[] args) {
        CirList c1=new CirList();
        c1.add(5);
        c1.byOrder(1,2,5);
    }
    Node first=new Node(-1);
    Node node;

    public void add(int num){
        Node temp=null;

        if (num<0){
            System.out.println("输入数字不合理");
            return;
        }

        for (int i=1;i<=num;i++){
            Node node1=new Node(i) ;
            if (i==1){
                first=node1;
                first.next=first;
                temp=first;


            }else {

                temp.next = node1;
                temp.next.next=first;
                temp=node1;


            }
        }



    }
    public void byOrder(int startno,int count,int nums){
            Node f1;
            Node h1;
            if (startno<1|| count<0||startno > nums){
                return;
            }
            f1=first;

            h1=first;
            while (true){
                if (h1.next==first){
                    break;
                }
                h1=h1.next;
            }

            for (int i=1;i<=startno-1;i++){
                f1=f1.next;
                System.out.println(f1.no);

                h1=h1.next;
            }
            while(h1==f1){
                for (int i=1;i<=count-1;i++){
                    f1=f1.next;
                    h1=h1.next;
                }
                System.out.println(f1.no);
                f1=f1.next;
                h1.next=f1;

            }
        System.out.println("最后留在圈内的"+f1.no);
    }


}
class Node{
    int no;
    Node next;
    public Node(int no){
        this.no=no;
    }
        }

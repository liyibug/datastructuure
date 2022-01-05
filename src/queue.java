import java.util.Scanner;

public class queue {
    private int maxsize;
    private int front;
    private int rear;
    private int[] arr;
    public  queue(int arrmaxsize){
        maxsize=arrmaxsize;
        arr=new int[arrmaxsize];
        front=-1;
        rear=-1;



    }
    public boolean isFull(){
        return rear==maxsize-1;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public void addNum(int num){
        if (this.isFull()){
            System.out.println("队列已满，无法添加数据");
            return;
        }
        rear++;
        arr[rear]=num;


    }
    public int getNum(){
        if (this.isEmpty()){
            throw new RuntimeException("队列已空，无法取出数据");
        }
        front++;
        return front;
    }
    public void showQueue(){
        if (this.isEmpty()){
            throw new RuntimeException("队列已空，无法展示数据");
        }
        for (int i = front+1; i <=rear ; i++) {
            System.out.println(arr[i]);

        }

    }
}
 class test{
    public static void main(palindrome[] args) {
        queue queues=new queue(3);
        Scanner scanner=new Scanner(System.in);


    }

        }

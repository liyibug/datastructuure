public class demo {

}
class arryque{
    private int rear;
    private int front;
    private int maxsize;
    private int[] arry;
    public void arryque(int maxsize){

    }
    boolean isEmpty(){
        return rear==front;
    }
    boolean isfull(){
        return (rear+1)%maxsize==front;

    }
    void addNum(int num){
        if(isfull()){
            System.out.println("队列已满，无法添加数据");
        }
        arry[rear]=num;

        rear=(rear+1)%maxsize;
    }
    int getNum(){
        if (isEmpty()){
            System.out.println("队列为空，无法取出数据");
        }
        int num=arry[front];
        System.out.println("出队元素是");
        front=(front+1)%maxsize;
        return num;

    }
    public void show(){
        for (int i=front;i<front+(rear-front+maxsize)%maxsize;i++){

            System.out.println(arry[i%maxsize]);
        }
    }
}

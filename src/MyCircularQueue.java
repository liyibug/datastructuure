class MyCircularQueue {
    int maxsize;
    int front=0;
    int rear=0;
    int[] arr;

    public MyCircularQueue(int k) {
        this.maxsize=k;
        this.arr=new int[k];

    }

    public boolean enQueue(int value) {
        if (this.isFull()){
            return false;
        }
        arr[rear]=value;
        rear=(rear+1)%maxsize;


        return true;
    }

    public boolean deQueue() {
        if (this.isEmpty()){
            return false;
        }
        front=(front+1)%maxsize;

    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return front;

    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return rear;

    }

    public boolean isEmpty() {
        if (this.front==this.rear){
            return true;
        }
        return false;


    }

    public boolean isFull() {
        if ((rear+maxsize-front)%maxsize==0){
            return true;
        }
        return false;


    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
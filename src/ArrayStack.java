public class ArrayStack {
    public static void main(palindrome[] args) {
        ArrayStack arrayStack=new ArrayStack(5);
        arrayStack.instack(1);
        arrayStack.instack(2);
        arrayStack.instack(3);
        arrayStack.instack(4);
        arrayStack.instack(5);
        arrayStack.instack(6);
        arrayStack.popstack();
        arrayStack.show();
    }
    int[] stack;
    int top=-1;
    int maxsize;
    public ArrayStack(int maxsize){
        this.maxsize=maxsize;
        stack=new int[maxsize];
    }
    public boolean isFull(){
        if (top==maxsize-1){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }else {
            return false;
        }
    }
    public void instack(int num){
        if (this.isFull()){
            System.out.println("已满");
            return;
        }else {
            top++;
            stack[top]=num;
        }
    }
    public int popstack(){
        if (this.isEmpty()){
            throw new RuntimeException("yikong");


        }
            //System.out.println(stack[top]);
            int i=top;
            top--;
            return stack[i];


    }
    public void show(){
        if (this.isEmpty()){
            System.out.println("kong");
            return;
        }else {
            for (int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    public int peek(){
        return stack[top];
    }

    public ArrayStack() {
    }
}


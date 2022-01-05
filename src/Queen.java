public class Queen {
    public static void main(palindrome[] args) {
        Queen queen=new Queen();
        queen.check(0);


    }
    public int max=8;
    public int[] array=new int[max];
    public boolean judged(int n){
        for (int i=0;i<n;i++){
            if (array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;

    }
    public void print(){
        for (int i=0;i<max;i++) {
            System.out.print(array[i]+"");
        }
        System.out.println();
    }
    public void  check(int n){
        if (n==8){
            this.print();
            return ;
        }

        for (int i = 0; i < max; i++) {
            array[n]=i;
            if (this.judged(n)){
                check(n+1);
            }

        }


    }
}

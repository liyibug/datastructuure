import java.util.Arrays;

public class Quick {
    public static void main(palindrome[] args) {
        int arr[]={6,1,2,7,9,3,4,5,8};
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] a){
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);

    }
    public static void sort(int[] a,int lo,int hi){
        if (hi<lo){
            return;
        }
        int partition=partition(a,lo,hi);
        sort(a,lo,partition-1);
        sort(a,partition+1,hi);

    }
    public static int partition(int[] a,int lo,int hi ){
        int key=a[lo];
        int left=lo;
        int right=hi+1;
        while (true){
            while (a[++left]<key){
                if (left==hi){
                    break;
                }
            }
            while (a[--right]>key){
                if (right==lo){
                    break;
                }
            }
            if (left>=right){
                break;
            }else {
                exch(a,left,right);
            }

        }

        exch(a,lo,right);
        return right;

    }
    public static void exch(int[] a,int i,int j){
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;


    }
    public static boolean less(int a,int b){

        return a-b<0;
    }
}

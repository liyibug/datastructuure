import java.util.Arrays;

public class Bullo2 {

    int max;


    public static void sort(int[] arry){
        int temp;
        for (int i=0;i<arry.length-1;i++){
            for (int j=i+1;j<arry.length;j++){
                if (arry[i]>arry[j]){
                    temp=arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arry));

    }

    public static void main(palindrome[] args) {
        int[] arr={2,1,5,4,9,8,6,7,3};
        sort(arr);
        select(arr);
    }
    public static void select(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){

                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }



}

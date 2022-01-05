import java.util.Arrays;

public class Bullo {


    public static void main(palindrome[] args) {
        int[] arr={4,1,7,2,5,3,9};
        int temp;
        boolean flag=true;
        for (int i=0;i<7;i++){
            for (int j=0;j<7-i-1;j++){
                if (arr[j+1]<arr[j]){
                    flag=false;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
           if (flag){
                break;
            }
            flag=true;
        }
        System.out.println(Arrays.toString(arr));
    }
}

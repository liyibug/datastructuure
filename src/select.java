import java.util.Arrays;

public class select {
    public static void main(palindrome[] args) {
        int[] arr={4,1,7,2,5,3,9};
        int temp;
        int min=0;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<7;j++){

                if (arr[min]>arr[j]){
                    min=j;
                }

            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}

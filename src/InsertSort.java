import java.util.Arrays;

public class InsertSort {

    public static void main(palindrome[] args) {
        int[] arr={4,1,7,2,5,3,6,8,9};
        int temp;
        boolean flag=false;
        int index;
        for (int i=0;i<arr.length-1;i++){
               temp=arr[i+1];
                index=i+1;
               while (index>0&&arr[index-1]>temp){
                   arr[index]=arr[index-1];
                   index--;
                   flag=true;

               }
               if (flag){
                   arr[index]=temp;
               }



            }
        System.out.println(Arrays.toString(arr));


        }



    }


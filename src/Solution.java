import java.util.Arrays;

public class Solution {
    public static void main(palindrome[] args) {
        int[] a={1,2,3,1,-6};
//        System.out.println(sum(a));
//        System.out.println(presum(a,2));
//        System.out.println(afsum(a,2));
        System.out.println(pivotIndex(a));

    }
    public static  int pivotIndex(int[] nums) {
        int total= Arrays.stream(nums).sum();
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if (2*sum +nums[i]==total){
                return i;

            }
            sum+=nums[i];
        }
        return -1;
//        int a= nums.length;
//        int index=-1;
//        for(int i=0;i<a;i++){
//            if (i==0&&sum(nums)==0){
//                index=0;
//                break;
//            }else if (presum(nums,i)==afsum(nums,i)){
//                index=i;
//                break;
//            }
//
//        }
//        return index;
    }
    public static  int sum(int[] nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static int presum(int[] nums,int temp){
        int index=1;
        int sum=0;
        for (int i=0;i<temp;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static int afsum(int[] nums,int temp){
        int index=1;
        int sum=0;
        for (int i=nums.length-1;i>temp;i--){
            sum+=nums[i];
        }
        return sum;

    }
}

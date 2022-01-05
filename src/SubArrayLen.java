public class SubArrayLen {
    public int minminSubArrayLen(int target, int[] nums){
        int n =nums.length;
        if (n==0){
            return 0;

        }
        int start=0;
        int end=0;
        int sum=0;
        int index=Integer.MAX_VALUE;

        while (end<n){
            sum+=nums[end];
            while (sum>=target){
                index=Math.min(index,end-start-1);
                sum-=nums[start];
                start++;
            }
            end++;

        }
    }
//    public int minSubArrayLen(int target, int[] nums) {
//        int minindex=0;
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum=nums[i];
//            int index=0;
//
//
//            for (int j=i;j<nums.length;j++){
//
//
//                    if (sum<=target){
//                        sum+=nums[j];
//                        index++;
//
//
//                    }else {
//                        break;
//                    }
//
//              if (j==nums.length-1){
//                  index=0;
//                  break;
//              }
//
//
//            }
//            if (index>minindex){
//                minindex=index;
//            }
//        }
//
//        return minindex;
//    }

}

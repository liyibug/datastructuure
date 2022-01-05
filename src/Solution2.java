public class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right =nums.length;
        int zj=0;
        int index=-1;
        while (left<right){
            zj=left+(right-left)/2;
            if (target<nums[zj]){
                right=zj-1;
            }else if (target>nums[zj]){
                left=zj+1;
            }else if (target==nums[zj]){
                index=zj;
            }


        }
        if (index==-1){
            return zj;
        }
        return left;

    }
}

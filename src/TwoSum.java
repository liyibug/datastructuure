public class TwoSum {
    public int removeElement(int[] nums, int val) {
        int temp=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){

                if (i!=temp){
                    nums[temp]=nums[i];

                }
                temp++;
            }else {
                nums[i]=0;

                }

        }

        return temp;

    }
}

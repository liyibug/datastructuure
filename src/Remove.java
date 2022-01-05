public class Remove {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;

        int slow=1;
        for (int i=1;i<n;i++){
            if (i<n&&nums[i]!=nums[i-1]){
                nums[slow]=nums[i];
                slow++;
            }

        }
        return slow;

    }
}

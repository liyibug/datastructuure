class Fixone {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,0,1};
        int a=findMaxConsecutiveOnes(nums);
        System.out.println(a);


    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int[] ints=new int[nums.length];
        int temp=0;
        int max=0;
        ints[temp]=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                temp++;
                ints[temp]=i;
                if (ints[temp]-ints[temp-1]>max){
                    max=ints[temp]-ints[temp-1];
                }
            }
        }
        if (nums.length-1-ints[temp]>max){
            max=ints[temp]-ints[temp-1];

        }

        return max;
    }
}
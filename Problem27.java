public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int hold = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = hold;
                }
            }
        }


        return nums.length-k;
    }
}

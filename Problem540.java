public class Problem540 {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length==1)
            return nums[0];

        for(int i=0;i<nums.length;i=i+2){
            int num = nums[i];

            if(i == nums.length-3){
                if(nums[i] == nums[i+1])
                    return nums[i+2];
                else
                    return nums[i];
            }

            if(nums[i] + nums[i+1] != num*2){

                if(nums[i] == nums[i+2])
                    return nums[i+1];
                else
                    return nums[i];
            }
        }

        return 0;
    }
}

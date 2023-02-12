public class Problem2 {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){


                if(nums[i] + nums[j] == target){

                    if(i==j)
                        j++;
                    else{
                        int[] result = {i,j};
                        return result;
                    }
                }
            }
        }
        return null;
    }
}

public class Problem35 {

    public int searchInsert(int[] nums, int target) {

        int index=-1;

        for(int i=0;i<nums.length;i++){

            if(nums[i] == target)
                return i;
            if(nums[i] < target)
                index = i;

        }

        return index+1;

    }

}

public class Problem169 {
    public int majorityElement(int[] nums) {

        int count = 0;
        int index = 0;
        int num = 0;

        while(index < nums.length){

            for(int i=0;i<nums.length;i++){

                num = nums[index];
                if(num == nums[i])
                    count++;

            }
            if(count > nums.length/2)
                return num;
            else{
                count = 0;
                index++;
            }
        }
        return num;
    }
}

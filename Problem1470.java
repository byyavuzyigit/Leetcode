public class Problem1470 {
    public int[] shuffle(int[] nums) {
        int[] x = new int[nums.length/2];
        int[] y = new int[nums.length/2];

        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2)
                x[i] = nums[i];
            else
                y[i-nums.length/2] = nums[i];
        }


        int indexOne = 0;
        int indexTwo = 0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = x[indexOne];
                indexOne++;
            }
            else{
                nums[i] = y[indexTwo];
                indexTwo++;
            }

        }
        return nums;
    }
}

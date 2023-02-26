public class Problem2574 {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];

        left[0] = 0;
        right[nums.length-1] = 0;
        int sum = 0;

        for(int i=1;i<nums.length;i++){
            sum += nums[i-1];
            left[i] = sum;
        }
        sum = 0;

        for(int i=1;i<nums.length;i++){
            sum += nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            right[i] = sum;
            sum -= nums[i+1];
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = Math.abs(left[i]-right[i]);
        }
        return answer;
    }
}

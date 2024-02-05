import java.util.ArrayList;
import java.util.List;

class Problem2404 {
    public int mostFrequentEven(int[] nums) {
        int answerCount = 0;
        int answer = -1;
        List<Integer> count = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(!elements.contains(nums[i])){
                    elements.add(nums[i]);
                    count.add(1);
                }
                else{
                    int index = elements.indexOf(nums[i]);
                    count.set(index,count.get(index)+1);
                }
            }
        }
        for(int i=0;i<elements.size();i++){
            if(count.get(i) > answerCount){
                answerCount = count.get(i);
                answer = elements.get(i);
            }
            else if(count.get(i) == answerCount){
                answer = elements.get(i) < answer ? elements.get(i) : answer;
            }
        }

        return answer;
    }
}

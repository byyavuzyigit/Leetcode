import java.util.ArrayList;
import java.util.List;

class Problem229 {
    public List<Integer> majorityElement(int[] nums) {
        int target = (int)Math.floor(nums.length/3);
        List<Integer> answer = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!elements.contains(nums[i])){
                elements.add(nums[i]);
                count.add(1);
            }
            else{
                int index = elements.indexOf(nums[i]);
                count.set(index,count.get(index)+1);
            }
        }
        for(int i=0;i<elements.size();i++){
            if(count.get(i)>target)
                answer.add(elements.get(i));
        }
        return answer;
    }
}

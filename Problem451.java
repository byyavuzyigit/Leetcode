import java.util.HashMap;

class Problem451 {
    public String frequencySort(String s) {
        HashMap<String,Integer> elements = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!elements.containsKey(s.charAt(i) + "")){
                elements.put(s.charAt(i) + "",1);
            }
            else{
                elements.replace(s.charAt(i) + "",elements.get(s.charAt(i) + "")+1);
            }
        }
        String result = "";
        int max = Integer.MIN_VALUE;
        String maxKey = "";
        while(!elements.isEmpty()){
            for(String key:elements.keySet()){
                if(elements.get(key) > max){
                    max = elements.get(key);
                    maxKey = key;
                }
            }
            elements.remove(maxKey);
            for(int i=0;i<max;i++){
                result += maxKey;
            }
            max = Integer.MIN_VALUE;
        }
        return result;
    }
}

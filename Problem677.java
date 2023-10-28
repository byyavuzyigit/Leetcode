import java.util.ArrayList;

class Problem677 {
    class MapSum{
        ArrayList<String> keys;
        ArrayList<Integer> values;
        public MapSum() {
            keys = new ArrayList<>();
            values = new ArrayList<>();
        }

        public void insert(String key, int val) {
            if(keys.contains(key)){
                values.set(keys.indexOf(key),val);
            }
            else{
                keys.add(key);
                values.add(val);
            }
        }

        public int sum(String prefix) {
            int added = 0;
            int length = prefix.length();
            for(int i=0;i<keys.size();i++){
                if(keys.get(i).length() >= length){
                    if(keys.get(i).substring(0,length).equals(prefix)){
                        added += values.get(i);
                    }
                }
            }
            return added;
        }
    }

}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */

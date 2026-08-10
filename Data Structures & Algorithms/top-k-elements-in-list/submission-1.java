class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] freq = new int[k];
       for(int i =0;i<k;i++){
        int max = 0;
        int key = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(max < entry.getValue()){
                max  = entry.getValue();
                key = entry.getKey();
            } 
        }
        freq[i] = key;
        map.remove(key);
       }

        return freq;

    }
}

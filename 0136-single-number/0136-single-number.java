class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>seen = new HashMap<>();
        for(int val : nums){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        for(int val : nums){
            if(seen.get(val) == 1){
                return val;
            }
        }
        return -1;
    }
}
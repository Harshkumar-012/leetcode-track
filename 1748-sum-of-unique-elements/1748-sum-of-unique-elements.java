class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>seen = new HashMap<>();
        for(int val : nums){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        int ans = 0;
        for(int val : nums){
            if(seen.get(val)==1){
                ans+=val;
            }
        }
        return ans;
    }
}
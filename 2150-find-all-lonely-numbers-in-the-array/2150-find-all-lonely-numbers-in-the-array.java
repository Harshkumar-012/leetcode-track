class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        HashMap<Integer,Integer>seen = new HashMap<>();
        for(int val : nums){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if (seen.get(nums[i]) == 1 && !seen.containsKey(nums[i] - 1) &&
            !seen.containsKey(nums[i] + 1)) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
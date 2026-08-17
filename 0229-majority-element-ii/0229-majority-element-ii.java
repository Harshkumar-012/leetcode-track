class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>seen = new HashMap<>();
        for(int i=0;i<n;i++){
            seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        }
        List<Integer>ans = new ArrayList<>();
        for(int val : seen.keySet()){
            if(seen.get(val)>n/3){
                ans.add(val);
            }
        }
        return ans;
    }
}
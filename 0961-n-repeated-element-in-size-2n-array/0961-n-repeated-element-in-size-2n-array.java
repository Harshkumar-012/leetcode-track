class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int m = n/2;
        // int count = m;
        HashMap<Integer,Integer>seen = new HashMap<>();
        for(int val:nums){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        for(int i=0;i<n;i++){
            if(seen.get(nums[i])==m){
                return nums[i];
            }
        }
        return -1;
    }
}
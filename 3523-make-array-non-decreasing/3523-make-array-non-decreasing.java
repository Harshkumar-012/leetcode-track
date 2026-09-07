class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n  = nums.length;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<=nums[i]){
                ans++;
            }
            max = Math.max(max,nums[i]);
        }
        return ans;
    }
}
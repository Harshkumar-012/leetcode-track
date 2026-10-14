class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int currsum = 0;
        int fir = nums[0];
        int sec = nums[1];
        for(int i=2;i<nums.length;i++){
            if(fir+sec==nums[i]){
                currsum++;
                if(currsum>ans){
                    ans = currsum;
                }
            }
            else{
                currsum = 0;
            }
            fir = nums[i-1];
            sec = nums[i];
        }
        if(ans>0){
            return ans+2;
        }
        return 2;
    }
}
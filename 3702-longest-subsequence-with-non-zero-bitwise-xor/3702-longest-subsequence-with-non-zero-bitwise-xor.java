class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int check = 0;
        for(int i=0;i<n;i++){
            ans^=nums[i];
            if(nums[i]==0){
                check++;
            }

        }
        if(ans!=0){
            return n;
        }
        if(check==n){
            return 0;
        }
        return n-1;
    }
}
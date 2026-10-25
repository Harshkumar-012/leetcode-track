class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans = 0;
        int check = 0;
        int left = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                check++;
            }
            while(check>1){
                if(nums[left]==0){
                    check--;
                }
                left++;
            }
            count = i-left+1;
            ans = Math.max(ans,count-1);
        }
        return ans;
    }
}
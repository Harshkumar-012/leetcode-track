class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int ans = 0;
        for(int i=0;i<n-m;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                if((nums[i+j+1]>nums[i+j]) && pattern[j]==1){
                    count++;
                }
                else if((nums[i+j+1] == nums[i+j]) && pattern[j]==0){
                    count++;
                }
                else if((nums[i+j+1]<nums[i+j]) && pattern[j]==-1){
                    count++;
                }
            }
            if(count==m){
                ans++;
            }
        }
        return ans;

    }
}
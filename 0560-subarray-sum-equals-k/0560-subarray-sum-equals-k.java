class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int check = 0;
            for(int j=i;j<n;j++){
                check+=nums[j];
                if(check==k){
                    ans++;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int a = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int check = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        ans = Math.min(ans,check);
                        a++;
                    }
                }
            }
        }
        if(a>0){
            return ans;
        }
        return -1;
    }
}
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int maxele = Integer.MIN_VALUE;
            int count = 1;
            int check = nums[i];
            for(int j=i;j<i+k;j++){
                maxele = Math.max(maxele,nums[j]);
                if(i!=j){
                    if(nums[j]-1==nums[j-1]){
                        count++;
                    }
                }
            }
            if(count==k){
                ans[i] = maxele;
            }
            else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    String check = nums[i]+nums[j];
                    if(check.equals(target)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
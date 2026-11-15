class Solution {
    public int countConsistent(int[] nums) {
        int count = 0;
        int ans = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int mini = Integer.MAX_VALUE;
            int check = nums[i];
            for(int j=i;j<n;j++){
                check = check&nums[j];
                mini = Math.min(mini,nums[j]);
                if(mini==check){
                    ans++;
                }
            }
        }
        return ans;
    }
}
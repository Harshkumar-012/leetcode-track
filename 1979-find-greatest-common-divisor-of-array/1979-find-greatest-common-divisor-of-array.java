class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int st = nums[0];
        int ed = nums[n-1];
        int ans = 0;
        for(int i=1;i<=st;i++){
            if(st%i==0 && ed%i==0){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}
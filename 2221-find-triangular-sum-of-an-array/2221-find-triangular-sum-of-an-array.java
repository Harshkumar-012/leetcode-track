class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int ans = 0;
        while(n>1){
            int[] temp = new int[n-1];
            for(int i=1;i<n;i++){
                temp[i-1] = (nums[i]+nums[i-1])%10;
            }
            ans = temp[temp.length-1];
            n--;
            nums = temp;
        }
        return ans;
    }
}
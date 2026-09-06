class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int currmax = nums[0];
        int currmin = nums[0];
        int max = nums[0];
        for(int i=1;i<n;i++){
            int val = nums[i];
            if(val<0){
                int temp = currmax;
                currmax = currmin;
                currmin = temp;
            }
            currmax = Math.max(val,currmax*val);
            currmin = Math.min(val,currmin*val);
            max = Math.max(max,currmax);
        }
        return max;
    }
}
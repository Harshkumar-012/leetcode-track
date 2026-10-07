class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int st = 0;
        int len = Integer.MAX_VALUE;
        int count = 0;
        for(int i=0;i<n;i++){
            count+=nums[i];
            while(count>=target){
                len = Math.min(len,i-st+1);
                count-=nums[st];
                st++;
            }
        }
        return len==Integer.MAX_VALUE?0:len;  
    }
}
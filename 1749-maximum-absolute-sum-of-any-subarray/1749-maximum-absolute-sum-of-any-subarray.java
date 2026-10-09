class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = 0;
        int currsum = 0;
        int minsum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            currsum+=nums[i];
            if(currsum>maxsum){
                maxsum = currsum;
            }
            if(currsum<0){
                currsum = 0;
            }
        }
        currsum = 0;
        for(int i=0;i<n;i++){
            currsum+=nums[i];
            if(currsum<minsum){
                minsum = currsum;
            }
            if(currsum>0){
                currsum = 0;
            }
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double count1 = 0;
        double maxcount = 0;
        for(int i=0;i<k;i++){
            count1+=nums[i];
        }
        maxcount = count1/k;
        for(int i=k;i<nums.length;i++){
            count1+=nums[i];
            count1-=nums[i-k];
            maxcount = Math.max(maxcount,count1/k);
        }
    return maxcount;
    }
}
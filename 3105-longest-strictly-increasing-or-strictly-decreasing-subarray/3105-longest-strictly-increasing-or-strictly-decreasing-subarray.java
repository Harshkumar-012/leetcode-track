class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int min = 1;
        int count = 1;
        int count1 = 1;
        int num1 = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
         for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count1++;
            }
            else{
                count1 = 1;
            }
            min = Math.max(min,count1);
        }
        return Math.max(max,min);
    }
}
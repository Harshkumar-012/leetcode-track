class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i+=2){
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        return count==n/2;
    }
}
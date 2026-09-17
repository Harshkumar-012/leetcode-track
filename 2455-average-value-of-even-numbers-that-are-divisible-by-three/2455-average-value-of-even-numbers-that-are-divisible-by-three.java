class Solution {
    public int averageValue(int[] nums) {
        int n = nums.length;
        int count = 0;
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                count+=nums[i];
                count1++;
            }
        }
        if(count1!=0){
            return count/count1;
        }
        return 0;
    }
}
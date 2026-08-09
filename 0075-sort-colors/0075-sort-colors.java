class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int st = 0;
        int mid = 0;
        int ed = n-1;
        while(mid<=ed){
            if(nums[mid]==0){
                int a = nums[st];
                nums[st] = nums[mid];
                nums[mid] = a;
                st++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int check1 = nums[mid];
                nums[mid] = nums[ed];
                nums[ed] = check1;
                ed--;
            }
        }
    }
}
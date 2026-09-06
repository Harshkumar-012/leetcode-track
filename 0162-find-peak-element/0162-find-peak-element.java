class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int st = 0;
        int ed = n-1;
        while(st<ed){
            int mid = (st+ed)/2;
            if(nums[mid]>nums[mid+1]){
                ed = mid;
            }
            else{
                st = mid+1;
            }
        }
        return ed;
    }
}
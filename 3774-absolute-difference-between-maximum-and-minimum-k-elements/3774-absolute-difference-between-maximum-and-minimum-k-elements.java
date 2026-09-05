class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int lar = 0;
        int sml = 0;
        for(int i=0;i<k;i++){
            sml+=nums[i];
        }
        for(int j=n-1;j>=n-k;j--){
            lar+=nums[j];
        }
        return lar-sml;
    }
}
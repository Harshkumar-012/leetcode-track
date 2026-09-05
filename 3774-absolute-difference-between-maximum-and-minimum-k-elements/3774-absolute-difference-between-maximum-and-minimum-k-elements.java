class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int lar = 0;
        int sml = 0;
        for(int i=0;i<k;i++){
            sml+=nums[i];
        }
        int a = n-1;
        while(k!=0){
            lar+=nums[a];
            a--;
            k--;
        }
        return lar-sml;
    }
}
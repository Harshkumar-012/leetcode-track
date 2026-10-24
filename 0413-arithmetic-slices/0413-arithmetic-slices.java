class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<3){
            return 0;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+2;j<n;j++){
                if((nums[j-1]-nums[j-2])==(nums[j]-nums[j-1])){
                    ans++;
                }
                else{
                    break;
                }
            }
        }
        return ans;
    }
}
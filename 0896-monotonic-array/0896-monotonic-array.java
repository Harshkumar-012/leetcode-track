class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int check1 = 0;
        int check2 = 0;
            for(int i=1;i<n;i++){
                if(nums[i-1]>=nums[i]){
                    check1++;
                }
                 if(nums[i-1]<=nums[i]){
                    check2++;
                }
            }
       
            
        
        return check1+1==n || check2+1==n;
    }
}
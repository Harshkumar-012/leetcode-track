class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone = 0;
        int currone = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currone++;
                if(currone>maxone){
                    maxone = currone;
                }
            }
            else{
                currone = 0;
            }
        }
        return maxone;
    }
}
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = nums.length;
        long count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                if(count>0){
                    while(count!=0){
                        ans+=count;
                        count--;
                    }
                }
                count = 0;
            }
        }
        if(count>0){
            while(count!=0){
                ans+=count;
                count--;
            }
        }
        return ans;
    }
}
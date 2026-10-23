class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int count = 0;
        int check = 0;
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                count++;
                count1 = 0;
            }
            while(count==k){
                if(nums[check]%2!=0){
                    count--;
                }
                count1++;
                check++;
            }
            ans+=count1;
        }
        return ans;
    }
}
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashSet<Integer>check = new HashSet<>();
        for(int i=0;i<n;i++){
            check.add(nums[i]);
        }
        int count = check.size();
        for(int i=0;i<n;i++){
            HashSet<Integer>check1 = new HashSet<>();
            for(int j=i;j<n;j++){
                check1.add(nums[j]);
                if(check1.size()==count){
                    ans++;
                }
            }
        }
        return ans;
    }
}
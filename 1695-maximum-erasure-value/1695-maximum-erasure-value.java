class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>seen = new HashMap<>();
        int st = 0;
        int currsum = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            int val = nums[i];
            seen.put(val,seen.getOrDefault(val,0)+1);
            currsum+=val;
            while(seen.get(val)>1){
                int left = nums[st];
                currsum-=left;
                st++;
                seen.put(left,seen.get(left)-1);
            }
            ans = Math.max(ans,currsum);
        }
        return ans;
    }
}
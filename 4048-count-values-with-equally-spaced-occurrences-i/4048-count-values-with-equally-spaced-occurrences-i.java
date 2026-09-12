class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>seen = new HashMap<>();
        for(int val : nums){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        int ans = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(j-i==k-j){
                        if((nums[i]==nums[j] && nums[j]==nums[k])){
                            if(seen.get(nums[i])==3){
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
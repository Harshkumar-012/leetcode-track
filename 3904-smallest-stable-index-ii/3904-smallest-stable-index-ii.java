class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxele = Integer.MIN_VALUE;
        int minele = Integer.MAX_VALUE;
        int[] check1 = new int[n];
        int[] check2 = new int[n];
        for(int i=0;i<n;i++){
            maxele = Math.max(maxele,nums[i]);
            check2[i] = maxele;
        }
        minele = nums[n-1];
        check1[n-1] = minele;
        for(int i=n-2;i>=0;i--){
            minele = Math.min(minele,nums[i]);
            check1[i] = minele;
        }
        for(int i=0;i<n;i++){
            if((check2[i]-check1[i])<=k){
                return i;
            }
        }
        return -1;
    }
}
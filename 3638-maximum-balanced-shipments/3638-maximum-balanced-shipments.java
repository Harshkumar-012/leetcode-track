class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int maxcount = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            int val = weight[i];
            maxcount = Math.max(maxcount,val);
            if(val<maxcount){
                ans++;
                maxcount = 0;
            }
        }
        return ans;
    }
}
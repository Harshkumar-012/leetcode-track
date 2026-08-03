class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int m = accounts[i].length;
            int res = 0;
            for(int j=0;j<m;j++){
                res+=accounts[i][j];
            }
            ans = Math.max(ans,res);
        }
        return ans;
    }
}
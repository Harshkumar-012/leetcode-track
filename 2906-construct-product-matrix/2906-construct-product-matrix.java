class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int mod = 12345;
        int[][] ans = new int[row][col];
        long mul = 1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j] = (int)mul;
                mul = (int)(mul*grid[i][j]%mod);
            }
        }
        long fir = 1;
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                ans[i][j] = (int)(ans[i][j]*fir%mod);
                fir = (int)(fir*grid[i][j]%mod);
            }
        }
        return ans;
    }
}
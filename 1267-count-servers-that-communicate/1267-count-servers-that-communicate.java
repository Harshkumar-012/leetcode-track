class Solution {
    public int countServers(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] check1 = new int[row];
        int[] check2 = new int[col];
        int ans = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    check1[i]++;
                    check2[j]++;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && (check1[i]>1 || check2[j]>1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
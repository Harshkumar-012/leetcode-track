class Solution {
    public String[] createGrid(int m, int n) {
        String ans[][] = new String[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = "#";
            }
        }
        for(int i=0;i<m;i++){
            ans[i][0] = ".";
        }
        for(int i=0;i<n;i++){
            ans[m-1][i] = ".";
        }
        String[] result = new String[m];
        for (int i=0;i<m;i++){
            result[i] = String.join("",ans[i]);
        }
        return result;
    }
}
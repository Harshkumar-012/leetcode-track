class Solution {
    public void rotate(int[][] matrix) {
          for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int st = 0;
            int ed = matrix[i].length - 1;
            while(st<ed){
                int rev = matrix[i][st];
                matrix[i][st] = matrix[i][ed];
                matrix[i][ed] = rev;
                st++;
                ed--;
            }
        }
    }
}
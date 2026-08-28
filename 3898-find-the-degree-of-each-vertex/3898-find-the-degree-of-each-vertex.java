class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int check = 0;
            for(int j=0;j<n;j++){
                check+=matrix[i][j];
            }
            ans.add(check);
        }
    return ans.stream().mapToInt(i->i).toArray();
    }
}
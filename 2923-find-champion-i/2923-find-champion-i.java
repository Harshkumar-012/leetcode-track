class Solution {
    public int findChampion(int[][] grid) {
        ArrayList<Integer>seen = new ArrayList<>();
        int n = grid.length;
        for(int i=0;i<n;i++){
            int m = grid[i].length;
            int num = 0;
            for(int j=0;j<m;j++){
                num+=grid[i][j];
            }
            seen.add(num);
        }
        int check = Collections.max(seen);
        for(int i=0;i<seen.size();i++){
            if(seen.get(i)==check){
                return i;
            }
        }
        return -1;
    }
}
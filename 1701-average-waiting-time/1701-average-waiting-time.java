class Solution {
    public double averageWaitingTime(int[][] c) {
        int n = c.length;
        long res1 = c[0][0]+c[0][1];
        long res = res1-c[0][0];
        for(int i=1;i<n;i++){
            long check = c[i][0];
            long check1 = c[i][1];
            if(res1<check){
                res1 = check;
            }
            res1+=check1;
            res+=(res1-check);
        }
        return (double)res/n;
    }
}
class Solution {
    public int[] closestDivisors(int num) {
        int ans[] = new int[2];
        int mindiff = Integer.MAX_VALUE;
        for(int i=num+1;i<=num+2;i++){
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    int firdiv = j;
                    int secdiv = i/j;
                    int currdiff = Math.abs(firdiv-secdiv);
                    if(currdiff<mindiff){
                        mindiff = currdiff;
                        ans[0] = firdiv;
                        ans[1] = secdiv;
                    }
                }
            }
        }
        return ans;
    }
}
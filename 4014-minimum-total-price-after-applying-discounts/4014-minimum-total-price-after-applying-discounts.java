class Solution {
    public double minPrice(int[] p, int[] d) {
        int n = p.length-1;
        int m = d.length-1;
        int a = Math.min(n,m);
        double ans = 0;
        int check = m;
        Arrays.sort(p);
        Arrays.sort(d);
            for(int i=n;i>=n-a;i--){
                ans+=(p[i]*(100.0-d[check]))/100.0;
                check--;
            }
        if(n>m){
            for(int i=0;i<n-m;i++){
                ans+=p[i];
            }
        }
        return ans;
    }
}
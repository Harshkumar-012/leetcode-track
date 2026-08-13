class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int n = p.length;
        int ans = 0;
        int st = 0;
        int ed = n-1;
       while(st<=ed){
        if(p[st]+p[ed]<=l){
            st++;
            ed--;
            ans++;
        }
        else{
            ans++;
            ed--;
        }
             
       }
       return ans;
    }
}
class Solution {
    public int wateringPlants(int[] p, int c) {
        int n = p.length;
        int check = c;
        int ans = 0;
        int b = 1;
        for(int i=0;i<n;i++){
           if(check >= p[i]) {
            check -= p[i];
            ans++;
           }
           else{
            ans += 2*i+1;
            check = c - p[i];
           }
        }
        return ans;  
    }
}
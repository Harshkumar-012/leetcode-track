class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 0;
        int res = 0;
        int count = s.charAt(0)-'0';
        int currcount = 0;
        int n = s.length();
        if(n==0){
            return 0;
        }
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            currcount = ch-'0';
            if(currcount==count+1){
                res++;
                ans = Math.max(ans,res);
                count = currcount;
            }
            else{
                count = currcount;
                res = 0;
            }
        }
        return ans+1;
    }
}
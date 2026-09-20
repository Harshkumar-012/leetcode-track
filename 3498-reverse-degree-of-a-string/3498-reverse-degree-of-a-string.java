class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int ch = s.charAt(i)-'a';
            int val = 26-ch;
            ans=ans+val*(i+1);
        }
        return ans;
    }
}
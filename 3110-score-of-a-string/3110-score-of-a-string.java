class Solution {
    public int scoreOfString(String s) {
        int check[] = new int[s.length()];
        int num = 0;
        for(char val : s.toCharArray()){
            check[num] = val;
            num++;
        }
        int ans = 0;
        int n = check.length;
        for(int i=1;i<n;i++){
            ans+=Math.abs(check[i]-check[i-1]);
        }
        return ans;
    }
}
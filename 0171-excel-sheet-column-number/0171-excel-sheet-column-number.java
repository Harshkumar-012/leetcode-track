class Solution {
    public int titleToNumber(String c) {
        int ans = 0;
        for(char val : c.toCharArray()){
            ans = ans*26 + (val-'A')+1;
        }
        return ans;
    }
}
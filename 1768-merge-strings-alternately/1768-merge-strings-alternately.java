class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int st = 0;
        while(st<n || st<m){
            if(st<n){
                ans.append(word1.charAt(st));
            }
            if(st<m){
                ans.append(word2.charAt(st));
            }
            st++;
        }
        return ans.toString();

    }
}
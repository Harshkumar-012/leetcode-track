class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i+=k){
            int count = 0;
            for(int j=i;j<i+k;j++){
                count+=s.charAt(j)-'a';
            }
            int rem = count%26;
            ans.append((char)('a'+rem));
        }
        return ans.toString();
    }
}
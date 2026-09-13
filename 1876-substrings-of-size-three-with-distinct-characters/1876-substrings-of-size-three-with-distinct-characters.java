class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        List<String>seen = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            seen.add(s.substring(i,i+3));
        }
        int m = seen.size();
        for(int i=0;i<m;i++){
            char check[] = seen.get(i).toCharArray();
            if(check[0]!=check[1] && check[0]!=check[2] && check[1]!=check[2]){
                ans++;
            }
        }
        return ans;
    }
}
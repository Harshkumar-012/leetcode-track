class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;
        int count = 0;
        HashMap<Character,Integer>seen = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            seen.put(ch,seen.getOrDefault(ch,0)+1);
            while(seen.get(ch)>=k){
                char leftchar = s.charAt(count);
                seen.put(leftchar,seen.get(leftchar)-1);
                count++;
            }
            ans+=count;
        }
        return ans;
    }
}
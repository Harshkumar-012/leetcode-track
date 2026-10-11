class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer>seen = new HashMap<>();
        int st = 0;
        int currsum = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            char val = s.charAt(i);
            seen.put(val,seen.getOrDefault(val,0)+1);
            currsum++;
            while(seen.get(val)>1){
                char left = s.charAt(st);
                currsum--;
                st++;
                seen.put(left,seen.get(left)-1);
            }
            ans = Math.max(ans,currsum);
        }
        return ans;
    }
}
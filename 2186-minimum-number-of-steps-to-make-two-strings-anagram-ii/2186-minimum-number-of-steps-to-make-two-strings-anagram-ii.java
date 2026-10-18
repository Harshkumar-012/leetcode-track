class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer>seen = new HashMap<>();
        for(char ch : s.toCharArray()){
            seen.put(ch,seen.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            seen.put(ch,seen.getOrDefault(ch,0)-1);
        }
        int ans = 0;
        for(int val: seen.values()){
            ans+=Math.abs(val);
        }  
        return ans;
    }
}
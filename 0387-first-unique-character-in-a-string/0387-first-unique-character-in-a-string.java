class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>seen = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            seen.put(ch,seen.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(seen.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
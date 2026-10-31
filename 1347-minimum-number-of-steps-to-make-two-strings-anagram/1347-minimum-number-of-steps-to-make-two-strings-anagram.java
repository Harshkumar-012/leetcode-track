class Solution {
    public int minSteps(String s, String t) {
        int m = s.length();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        HashMap<Character,Integer>check1 = new HashMap<>();
        HashMap<Character,Integer>check2 = new HashMap<>();
        for(char ch : ch1){
            check1.put(ch,check1.getOrDefault(ch,0)+1);
        }
        for(char ch : ch2){
            check2.put(ch,check2.getOrDefault(ch,0)+1);
        }
        int ans = 0;
        for(char ch : check1.keySet()){
            int count1 = check1.get(ch);
            int count2 = check2.getOrDefault(ch,0);
            if(count1>count2){
                ans+=count1-count2;
            }
        }
        return ans;
    }
}
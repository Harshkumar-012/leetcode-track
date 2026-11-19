class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        int count = 0;
        int left = 0;
        HashMap<Character,Integer>check = new HashMap<>();
        for(int i=0;i<n;i++){
            char val = s.charAt(i);
            check.put(val,check.getOrDefault(val,0)+1);
            while(check.size()==3){
                check.put(s.charAt(left),check.get(s.charAt(left))-1);
                if(check.get(s.charAt(left))==0){
                    check.remove(s.charAt(left));
                }
                left++;
                ans+=n-i;
            }
        }
        return ans;
    }
}
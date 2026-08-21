class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray   = s.toCharArray();
        Arrays.sort(charArray);
        String sa = new String(charArray);

        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        String ta = new String(charArray2);

        int n = sa.length();
        int m = ta.length();
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            if(sa.charAt(i)!=ta.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
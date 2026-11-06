class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for(int i=0;i<=haystack.length()-n;i++){
            String check = haystack.substring(i,i+n);
            if(check.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
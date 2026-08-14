class Solution {
    public boolean checkIfPangram(String s) {
        int n = s.length();
        if(n<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(s.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
}
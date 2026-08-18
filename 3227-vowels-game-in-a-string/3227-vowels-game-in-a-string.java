class Solution {
    public boolean doesAliceWin(String s) {
        int ans = 0;
        for(Character ch :s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ans++;
            }
        }
        return ans>=1;
    }
}
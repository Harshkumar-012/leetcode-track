class Solution {
    public int firstMatchingIndex(String s) {
        char check[] = s.toCharArray();
        int n = check.length;
        for(int i=0;i<n;i++){
            if(check[i]==check[n-i-1]){
                return i;
            }
        }
        return -1;
    }
}
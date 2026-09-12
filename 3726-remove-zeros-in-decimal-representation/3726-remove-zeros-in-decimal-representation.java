class Solution {
    public long removeZeros(long n) {
        long ans = 0 ;
        String check = Long.toString(n);
        char[] res = check.toCharArray();
        for(int i=0;i<res.length;i++){
            int val = res[i]-'0';
            if(val!=0){
                ans = ans*10 + val;
            }
        }
        return ans;
    }
}
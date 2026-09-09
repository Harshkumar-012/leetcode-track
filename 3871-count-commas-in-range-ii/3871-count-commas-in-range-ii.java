class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long currcom = 1000;
        while(n>=currcom){
            ans+= (n-currcom)+1;
            currcom*=1000;
        }
        return ans;
    }
}
class Solution {
    public long countCommas(long n) {
        long ans = 0;
        if(n<1000){
            ans = 0;
        }
        if(n>=1000000000000000L){
            ans+=(n-999999999999999L);
        }
        if(n>=1000000000000L){
            ans+=(n-999999999999L);
        }
        if(n>=1000000000L){
            ans+=(n-999999999L);
        }
        if(n>=1000000L){
            ans+=(n-999999L);
        }
        if(n>=1000L){
            ans+=(n-999L);
        }
        return ans;
    }
}


// long ans = 0;
        // long currcom = 1000;
        // while(n>=currcom){
        //     ans+= (n-currcom)+1;
        //     currcom*=1000;
        // }
        // return ans;
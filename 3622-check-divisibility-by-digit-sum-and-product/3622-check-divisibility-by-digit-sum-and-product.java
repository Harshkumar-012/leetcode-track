class Solution {
    public boolean checkDivisibility(int n) {
        int orginal = n;
        long sum = 0;
        long product = 1;
        while(n>0){
            int ld = n%10;
            sum += ld;
            product *= ld;
            n/=10;
        }
        return orginal%(sum+product)==0;
    }
}
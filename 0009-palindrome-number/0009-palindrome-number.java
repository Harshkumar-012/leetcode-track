class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int res = 0;
        int num = x;
        while(num!=0){
            int ld = num%10;
            res = res*10 + ld;
            num/=10;
        }
        return res==x;
    }
}
class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int res = n;
            int check = 0;
            while(res!=0){
                int ld = res%10;
                check+=ld*ld;
                res/=10;
            }
            n = check;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}
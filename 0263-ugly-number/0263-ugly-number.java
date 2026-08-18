class Solution {
    boolean isUgly(int num){
        if(num<=0) return false;
        while(num%2==0){
            num/=2;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%5==0){
            num/=5;
        }
        return num==1;
    }
    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        int count = 0;
        for(int i=1;;i++){
            if(isUgly(i)){
                count++;
                if(count == n){
                    return i;
                }
            }
        }
    }
}
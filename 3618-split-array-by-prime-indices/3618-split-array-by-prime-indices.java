class Solution {
    boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public long splitArray(int[] nums) {
        long sum1 = 0;
        long sum2 = 0;
        for(int i=0;i<nums.length;i++){
            if(isprime(i)){
                sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        return Math.abs(sum1-sum2);
    }
}
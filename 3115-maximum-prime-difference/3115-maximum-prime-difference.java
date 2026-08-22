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

    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int st = 0;
        int ed = n-1;
        while(st<=ed){
            if(isprime(nums[st]) && isprime(nums[ed])){
                return Math.abs(ed-st);
            }
            else if(!isprime(nums[st])){
                st++;
            }
            else if(!isprime(nums[ed])){
                ed--;
            }
        }
    return 0;
    }
}
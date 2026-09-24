class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int digit = 0;
            int val = nums[i];
            while(val!=0){
                int ld = val%10;
                digit+=ld;
                val/=10;
            }
            if(digit==i){
                return i;
            }
        }
        return -1;
    }
}
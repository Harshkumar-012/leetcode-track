class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int count1 = 0;
        int count2 = 0;
        int mincount1 = Integer.MAX_VALUE;
        int mincount2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                count1++;
                mincount1 = Math.min(mincount1,nums1[i]);
            }
            else{
                count2++;
                mincount2 = Math.min(mincount2,nums1[i]);
            }
        }
        return count1==n || count2==n || mincount1>mincount2;
    }
}
class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        // int[] check = new int[n];
        // for(int i=0;i<n;i++){
        //     check[i] = nums1[i];
        // }
         int count = 0;
         int count1 = 0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                count++;
            }
            count1++;
        }
        return count==n || count1==n;
    }
}
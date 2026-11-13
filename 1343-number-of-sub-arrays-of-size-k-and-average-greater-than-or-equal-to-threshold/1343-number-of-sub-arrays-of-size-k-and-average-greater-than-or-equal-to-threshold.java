class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int count = 0;
        int left = 0;
        for(int i=0;i<k;i++){
           count+=arr[i];
        }
        if(count/k>=threshold){
            ans++;
        }
        for(int i=k;i<arr.length;i++){
            count+=arr[i];
            count-=arr[left];
            if(count/k>=threshold){
                ans++;
            }
            left++;
        }
        return ans;
    }
}
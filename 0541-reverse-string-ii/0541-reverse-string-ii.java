class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i+=2*k){
            int st = i;
            int ed = Math.min(i+k-1,n-1);
            while(st<ed){
                char a = arr[st];
                arr[st] = arr[ed];
                arr[ed] = a;               
                st++;
                ed--; 
            }
        }
        return new String(arr);
    }
}
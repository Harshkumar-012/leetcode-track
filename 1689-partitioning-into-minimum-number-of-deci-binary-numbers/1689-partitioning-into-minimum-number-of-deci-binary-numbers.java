class Solution {
    public int minPartitions(String n) {
        int ans = Integer.MIN_VALUE;
        int m = n.length();
        for(int i=0;i<m;i++){
            int digit = n.charAt(i)-'0';
            ans = Math.max(ans,digit);
        }
        return ans;
    }
}
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int ans = 0;
        int count = 0;
        int left = 0;
        for(int i=0;i<n;i++){
            count+=Math.abs((s.charAt(i)-'a')-(t.charAt(i)-'a'));
            while(count>maxCost){
                count-=Math.abs((s.charAt(left)-'a')-(t.charAt(left)-'a'));
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
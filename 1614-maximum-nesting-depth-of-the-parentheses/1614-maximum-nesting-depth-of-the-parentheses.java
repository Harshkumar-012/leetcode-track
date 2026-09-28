class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int ans = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
                ans = Math.max(ans,count);
            }
            else if(ch==')'){
                count--;
            }
        }
        return ans;
    }
}
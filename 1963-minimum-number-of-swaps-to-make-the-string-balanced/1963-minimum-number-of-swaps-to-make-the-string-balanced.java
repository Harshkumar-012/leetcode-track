class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int open = 0;
        int close = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='['){
                open++;
            }
            else if(ch==']'){
                if(open>0){
                    open--;
                }
                else{
                    close++;
                }
            }
        }
        return (close+1)/2;
    }
}
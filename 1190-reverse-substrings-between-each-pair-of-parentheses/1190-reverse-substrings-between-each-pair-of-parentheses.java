class Solution {
    public String reverseParentheses(String s) {
        StringBuilder check = new StringBuilder(s);
        int n = s.length();
        while(true){
            int st = -1;
            int ed = -1;
            for(int i=0;i<check.length();i++){
                if(check.charAt(i)==')'){
                    ed = i;
                    break;
                }
            }
            if(ed==-1){
                break;
            }
            for(int i=ed-1;i>=0;i--){
                if(check.charAt(i)=='('){
                    st = i;
                    break;
                }
            }
            if(st==-1){
                break;
            }
            int left = st+1;
            int right = ed-1;
            while(left<right){
                char ch = check.charAt(left);
                check.setCharAt(left,check.charAt(right));
                check.setCharAt(right,ch);
                left++;
                right--;
            }
            check.deleteCharAt(ed);
            check.deleteCharAt(st);
        }
        return check.toString();
    }
}
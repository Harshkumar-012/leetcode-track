class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int open = 0;
        int close = 0;
        Stack<Character>ans = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            ans.push(ch);
            if(ch=='('){
                open++;
            }
            else if(ch==')'){
                close++;
            }
            if(open==close){
                ans.pop();
                StringBuilder temp = new StringBuilder();
                while(ans.size()!=1){
                    temp.insert(0,ans.pop());
                }
                ans.clear();
                res.append(temp);
                open = 0;
                close = 0;
            }

        }
        return res.toString();
    }
}
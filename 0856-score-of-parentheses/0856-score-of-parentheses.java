class Solution {
    public int scoreOfParentheses(String s) {
        // int n = s.length();
        // int ans = 0;
        // int open = 0;
        // int close = 0;
        // for(int i=0;i<n;i++){
        //     char ch = s.charAt(i);
        //     if(ch=='('){
        //         open++;
        //     }
        //     else{
        //         if(s.charAt(i-1)=='('){
        //             ans+=(int)(Math.pow(2,open-1));
        //         }
        //         open--;
                
        //     }            
        // }
        // return ans;
        Stack<Character>seen = new Stack<>();
        int count = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                seen.push(ch);
                count++;
            }
            else{
                char check = seen.pop();
                if(s.charAt(i-1)=='('){
                    ans+=(int)(Math.pow(2,count-1));
                }
                count--;
            }
        }
        return ans;
    }
}
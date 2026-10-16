class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character>seen = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                seen.push(ch);
            }
            else{
                if(seen.isEmpty()){
                    return false;
                }
                char check = seen.pop();
                if(ch==')' && check!='('){
                    return false;
                }
                if(ch==']' && check!='['){
                    return false;
                }
                if(ch=='}' && check!='{'){
                    return false;
                }
            }
        }
        if(seen.isEmpty()){
            return true;
        }
        return false;
    }
}
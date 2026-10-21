class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Character>seen = new Stack<>();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(s.charAt(i)=='('){   
                count++;
                seen.push(ch);
            }
            else if(s.charAt(i)==')'){
                if(count==0){
                    continue;
                }
                count--;
                seen.push(ch);
            }
            else{
                seen.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=seen.size()-1;i>=0;i--){
            char ch = seen.get(i);
            if(ch=='(' && count>0){
                count--;
                continue;
            }
            ans.append(ch);
        }
        return ans.reverse().toString();
    }
}
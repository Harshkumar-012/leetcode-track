class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer>seen =  new Stack<>();
        for(String val : ops){
            if(val.equals("+")){
                int top = seen.pop();
                int newtop = top+seen.peek();
                seen.push(top);
                seen.push(newtop);
            }
            else if(val.equals("D")){
                seen.push(2*seen.peek());
            }
            else if(val.equals("C")){
                seen.pop();
            }
            else{
                seen.push(Integer.parseInt(val));
            }
        }
        int ans = 0;
        for(int val : seen){
            ans+=val;
        }
        return ans;
    }
}
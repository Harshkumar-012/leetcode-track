class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                count1++;
            }
            else if(ch==')'){
                if(count1>0){
                    count1--;
                }
                else{
                    count2++;
                }
            }
        }
        return count1+count2;
    }
}
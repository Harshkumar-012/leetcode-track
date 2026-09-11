class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int count[] = new int[n];
        for(int i=0;i<n;i++){
            if(ans.length()>0 && s.charAt(i)==ans.charAt(ans.length()-1)){
                count[ans.length()] = count[ans.length()-1]+1;
                ans.append(s.charAt(i));
            }
            else{
                count[ans.length()] = 1;
                ans.append(s.charAt(i));

            }
            if(count[ans.length()-1]==k){
                ans.delete(ans.length()-k,ans.length());
            }
        }
        return ans.toString();
    }
}   


 
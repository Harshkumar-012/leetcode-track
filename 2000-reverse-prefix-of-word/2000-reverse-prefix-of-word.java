class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        char[] res = word.toCharArray();
        int n = res.length;
        int a = 0;
        for(int i=0;i<n;i++){
            char cha = res[i];
            if(cha==ch && a==0){
                ans.append(cha);
                ans.reverse();
                a++;
            }
            else{
                ans.append(cha);
            }
        }
        return ans.toString();
    }
}
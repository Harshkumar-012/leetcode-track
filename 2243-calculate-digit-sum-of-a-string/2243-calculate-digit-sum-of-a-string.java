class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder check = new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                String count = s.substring(i,Math.min(i+k,s.length()));
                int check1 = 0;
                for(int j=0;j<count.length();j++){
                    check1+=count.charAt(j)-'0';
                }
                check.append(check1);
            }
            s = check.toString();
        }
        return s;
    }
}
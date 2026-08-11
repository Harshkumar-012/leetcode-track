class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String val : details){
            long age = (val.charAt(11)-'0')*10 + (val.charAt(12)-'0');
            if(age>60){
                ans++;
            }
        }
        return ans;
    }
}
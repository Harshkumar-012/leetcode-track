class Solution {
    public int maxConsecutiveAnswers(String ans, int k) {
        int n = ans.length();
        int count = 0;
        int left = 0;
        int maxlen = 0;
        for(int i=0;i<n;i++){
            if(ans.charAt(i)=='F'){
                count++;
            }
            while(count>k){
                if(ans.charAt(left)=='F'){
                    count--;
                }
                left++;
            }
            maxlen = Math.max(maxlen,i-left+1);
        }
        left = 0;
        count = 0;
        int maxlen1 = 0;
        for(int i=0;i<n;i++){
            if(ans.charAt(i)=='T'){
                count++;
            }
            while(count>k){
                if(ans.charAt(left)=='T'){
                    count--;
                }
                left++;
            }
            maxlen1 = Math.max(maxlen1,i-left+1);
        }
        return Math.max(maxlen,maxlen1);
    }
}
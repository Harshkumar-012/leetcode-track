class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer>ans  = new HashSet<>();
        for(int i=0;i<n;i++){
           int val = digits[i];
           if(val==0){
            continue;
           }
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(i==k || j==k){
                        continue;
                    }
                    int check = val*100 + digits[j]*10 + digits[k];
                    if(check%2==0){
                        ans.add(check);
                    }
                }
            }
        }      
        return ans.size();
    }
}
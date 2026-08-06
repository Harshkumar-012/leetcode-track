class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+10;i++){
            int check = i;
            int prod = 1;
            while(check!=0){
                int ld = check%10;
                prod*=ld;
                check/=10;
            }
            if(prod%t==0){
                 return i; 
            }
        }
        
       
        return -1;
    }
}
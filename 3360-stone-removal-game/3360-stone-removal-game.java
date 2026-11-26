class Solution {
    public boolean canAliceWin(int n) {
        int alice = 0;
        int bob = 0;
        int stones = 10;
        int count = 0;
        while(n>=stones){
            n-=stones;
            if(count==0){
                alice++;
                count++;
            }
            else{
                bob++;
                count--;
            }
            stones--;
        }
        return alice>bob;
    }
}
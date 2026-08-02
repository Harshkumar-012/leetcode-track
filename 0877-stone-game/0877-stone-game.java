class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int st = 0;
        int ed = n-1;
        int alice = 0;
        int bob = 0;
        while(st<ed){
            alice+=piles[ed];
            bob+=piles[st];
            st++;
            ed--;
        }
        return alice>bob;
    }
}
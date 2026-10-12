class Solution {
    boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer>seen = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                seen.add(i);
            }
        }
        int mindiff = Integer.MAX_VALUE;
        int fir = -1;
        int sec = -1;
        for(int i=1;i<seen.size();i++){
            int diff = seen.get(i)-seen.get(i-1);
            if(diff<mindiff){
                mindiff = diff;
                fir = seen.get(i-1);
                sec = seen.get(i);
            }
        }
        return new int[]{fir,sec};
    }
}
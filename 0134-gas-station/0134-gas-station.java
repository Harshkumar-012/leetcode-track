class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int count = 0;
        int curr = 0;
        int pos = -1;
        for(int i=0;i<n;i++){
            int diff = gas[i]-cost[i];
            count+=diff;
            curr+=diff;
            if(curr<0){
                curr = 0;
                pos = i;
            }
        }
        if(count>=0){
            return pos+1;
        }
        return -1;
    }
}
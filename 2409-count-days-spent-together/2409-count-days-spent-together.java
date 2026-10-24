class Solution {
    int countdays(String check){
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int mon = Integer.parseInt(check.substring(0,2));
            int day = Integer.parseInt(check.substring(3));
            int res = 0;
            for(int i=0;i<mon-1;i++){
                res+=days[i];
            }
            res+=day;
            return res;
        }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arrive = Math.max(countdays(arriveAlice),countdays(arriveBob));
        int leave = Math.min(countdays(leaveAlice),countdays(leaveBob));
        if(arrive>leave){
            return 0;
        }
        return leave-arrive+1;
    }
}        
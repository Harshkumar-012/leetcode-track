class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>seen = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int check = i;
            int count = 0;
            while(check!=0){
                int ld = check%10;
                check/=10;
                if(ld!=0 && i%ld==0){
                    count = count*10+ld;
                }
            }
            int count1 = 0;
            while(count != 0){
                int ld = count%10;
                count/=10;
                count1 = count1*10+ld;
            }
            if(count1==i){
                seen.add(i);
            }
        }
        return seen;
    }
}
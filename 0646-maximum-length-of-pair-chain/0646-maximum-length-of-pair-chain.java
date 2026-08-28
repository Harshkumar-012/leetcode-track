class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });
        int ans = 0;
        int n = pairs.length;
        if(pairs[0][0]<pairs[0][1]){
                ans++;
        }               
        int prev = pairs[0][1];;
        for(int i=1;i<n;i++){
            if(pairs[i][0]<pairs[i][1] && prev<pairs[i][0]){
                ans++;
                prev = pairs[i][1];
            }
        }
    return ans;
    }
}
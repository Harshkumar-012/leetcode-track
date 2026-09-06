class Solution {
    public List<Integer> findPeaks(int[] m) {
        List<Integer>ans = new ArrayList<>();
        int n = m.length;
        for(int i=1;i<n-1;i++){
            if(m[i]>m[i-1] && m[i]>m[i+1]){
                ans.add(i);
            }
        }
        return ans;
    }
}
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        HashSet<Integer>ans = new HashSet<>();
        HashSet<Integer>check = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==0){
                    ans.add(nums[i][j]);
                }
                else{
                    check.add(nums[i][j]);
                }
            }
            if(i>0){
                ans.retainAll(check);
                check.clear();
            }
        }
        List<Integer>res = new ArrayList<>();
        for(int val : ans){
            res.add(val);
        }
        Collections.sort(res);
        return res;
    }
}
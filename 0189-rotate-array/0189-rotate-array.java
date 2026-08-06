class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer>ans = new ArrayDeque<>();
        int n = nums.length;
        if(n==0){
            return ;
        }
        k = k%n;
        int st=0;
        int ed = n-1;
        for(int i=0;i<n;i++){
            if(k>i){
                ans.addFirst(nums[ed]);
                ed--;
            }
            else {
                ans.addLast(nums[st]);
                st++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=ans.pollFirst();
        }
    }
}
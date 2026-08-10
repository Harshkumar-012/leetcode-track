class Solution {
    public int findSpecialInteger(int[] arr) {
       HashMap<Integer, Integer> seen = new HashMap<>();

        for (int val : arr) {
            seen.put(val, seen.getOrDefault(val, 0) + 1);
        }
        int n = arr.length;
        int t = n/4;
        for (int val : arr) {
                if(seen.get(val) >= t+1){
                    return val;
                }
        }

        return -1;
    }
}
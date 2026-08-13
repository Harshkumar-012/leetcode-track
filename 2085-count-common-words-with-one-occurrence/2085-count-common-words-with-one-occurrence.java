class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>seen = new HashMap<>();
        HashMap<String,Integer>seen1 = new HashMap<>();
        int ans = 0;
        for(String val : words1){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        for(String val : words2){
            seen1.put(val,seen1.getOrDefault(val,0)+1);
        }
        for(String val : words1){
            if(seen.getOrDefault(val,0)==1 && seen1.getOrDefault(val,0)==1){
                ans++;
            }
        }
        return ans;
    }
}
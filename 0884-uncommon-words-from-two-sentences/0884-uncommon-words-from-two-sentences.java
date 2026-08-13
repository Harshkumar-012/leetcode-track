class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>seen = new HashMap<>();
        HashMap<String,Integer>seen1 = new HashMap<>();
        for(String val : s1.split(" ")){
            seen.put(val,seen.getOrDefault(val,0)+1);
        }
        for(String val : s2.split(" ")){
            seen1.put(val,seen1.getOrDefault(val,0)+1);
        }

        List<String> ans = new ArrayList<>();
        for(String val : s1.split(" ")){
            if(seen.getOrDefault(val,0)==1 && seen1.getOrDefault(val,0)==0){
                ans.add(val);
            }
        }
        for(String val : s2.split(" ")){
            if(seen.getOrDefault(val,0)==0 && seen1.getOrDefault(val,0)==1){
                ans.add(val);
            }
        }
        String[] res = new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
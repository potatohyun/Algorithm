import java.util.*;
class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = 0;
        
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }
        while (idx + 1 < msg.length()){
            String tmp = "";
            String pre = String.valueOf(msg.charAt(idx));
            for (int i = 1; idx + i <= msg.length() ; i++) {
                tmp = msg.substring(idx, idx + i);
                if(!map.containsKey(tmp)){
                    map.put(tmp, map.size() + 1);
                    break;
                }
                pre = tmp;
            }
            arr.add(map.get(pre));
            idx += pre.length();
        }
        if(idx == msg.length() - 1){
            arr.add(map.get(String.valueOf(msg.charAt(idx))));
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
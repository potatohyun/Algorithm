import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        char[] alpa = s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            // Character.toString(alpa[i])
            String tmp = Character.toString(alpa[i]);
            if(!m.containsKey(tmp)){
                answer[i] = -1;
                m.put(tmp,i);
            }
            else{
                answer[i] =i-m.get(tmp);
                // m.remove(Character.toString(alpa[i]));
                m.put(tmp,i);
            }
        }
        
        return answer;
    }
}
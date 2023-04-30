import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // String answer = "";
        // Arrays.sort(participant);
        // Arrays.sort(completion);
        // for(int i = 0; i < participant.length; i++){
        //     if(i == completion.length){
        //         answer += participant[i];
        //     }
        //     else if(!participant[i].equals(completion[i])){
        //         answer += participant[i];
        //         break;
        //     }
        // }
        
        //다른사람 풀이
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        //key에 선수이름, value에 그 선수이름을 가진 사람의 수(동명이인때문에)
        //getOrDefault(A,B) : 있으면 A반환, 없으면B반환
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        // System.out.println(hm);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        
        
        return answer;
    }
}
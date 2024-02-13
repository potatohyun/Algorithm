import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] c: clothes){
            if(!map.containsKey(c[1])){
                map.put(c[1],1);
            }else{
                map.put(c[1],map.get(c[1])+1);
            }
        }
        for (Integer v : map.values()) {
          // System.out.println(v);
            answer = answer * (v+1);
        }
        answer--;
        
        // map.forEach((k,v) -> System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", k, v)));        
        
//         //entrySet활용
//         for (Entry<Integer, String> entry : map.entrySet()) {
//             System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
//         }

//         //KeySet() 활용
//         for(Integer i : map.keySet()){ //저장된 key값 확인
//             System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
//         }

        
        return answer;
    }
}
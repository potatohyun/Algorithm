import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // 시간초과
//         boolean answer = true;
//         boolean flag = false;
        
//         for(int i = 0; i<phone_book.length; i++){
//             for(int j = i+1; j<phone_book.length; j++){
//                 if(phone_book[i].startsWith(phone_book[j])){
//                     answer = false; 
//                     flag = true;
//                     break;
//                 }
//                 if(phone_book[j].startsWith(phone_book[i])){
//                     answer = false;
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag == true){
//                 break;
//             }
//         }
        
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phone_book.length; i++) 
            map.put(phone_book[i], i);
            
        
        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++){
                // System.out.println(phone_book[i].substring(0, j));
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;                  
            }                        
        return true;
    }
}
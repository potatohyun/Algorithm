import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int t : topping) {
            if(map.containsKey(t)) {
                map.put(t, map.get(t)+1);
            } else {
                map.put(t, 1);
            }
        }
        System.out.println(map.size());

        for(int t : topping) {
            map.put(t, map.get(t)-1);
            set.add(t);
            if(map.get(t)==0) {
                map.remove(t);
            }
            if(map.size()==set.size()) {
                answer++;
            }
        }
        
//         int answer = 0;
//         Set<Integer> hyung = new HashSet<Integer>();
//         Set<Integer> dongsang = new HashSet<Integer>();
//         for (int c = 1; c <= topping.length-1; c++) {
//             for (int i = 0; i < topping.length; i++) {
//                 if(i<c){
//                     hyung.add(topping[i]);
//                 }else{
//                     dongsang.add(topping[i]);
//                 }
//             }
//             if (hyung.size() ==dongsang.size()){
//                 answer++;
//             }

//         }

        return answer;
    }
}
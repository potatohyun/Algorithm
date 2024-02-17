import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        for (String c:cities){
            c=c.toLowerCase();
            if (queue.isEmpty()) {
                if(cacheSize != 0){  
                    queue.add(c);
                }
                answer += 5;
            }
            else if (queue.contains(c)){
                queue.remove(c);
                queue.add(c);
                answer++;
            }else{
                if (queue.size() == cacheSize){
                    queue.remove();
                }
                queue.add(c);
                answer += 5;
            }
        }
        return answer;
    }
}
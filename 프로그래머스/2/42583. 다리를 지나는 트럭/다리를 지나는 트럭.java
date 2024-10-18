import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        Queue<Integer> trucks = new LinkedList<>();
        for(int i:truck_weights) {
            trucks.offer(i);
        }
        
        int sum = 0;
        while(bridge.size()!=0){
            sum-=bridge.peek();
            bridge.poll();
            if (trucks.size()!=0 && (sum + trucks.peek())<=weight){
                sum += trucks.peek();
                bridge.offer(trucks.poll());
            } else if(trucks.size()!=0){
                bridge.offer(0);
            }
            // System.out.println(bridge);
            answer++;
        }
        return answer;
    }
}
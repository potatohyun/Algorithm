import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        
        long left = 1;
        long right = (long) n * times[times.length - 1]; //가장 오래 걸릴수 있는 경우

        
        while (left <= right){
            long sum = 0;
            long mid = (long) (left + right) / 2;
            for(int t : times){
                sum += mid / t;
            }               
             
            if(sum >= n){
                answer = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            
        }
        
        
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        int index = 0;
        Arrays.sort(d);
        while(total<=budget && index < d.length && (total+d[index] <= budget)){
            total += d[index];
            index += 1;
            answer ++;
        }
        return answer;
    }
}
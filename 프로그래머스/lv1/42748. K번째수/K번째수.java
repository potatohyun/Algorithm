import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // int[] answer = {};
        int[] answer = new int[commands.length];
        
        int c_len = commands.length;
        
        for(int i = 0; i < c_len; i++){
            int[] tmp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
            // System.out.println(Arrays.toString(answer));
        }
        
        return answer;
    }
}
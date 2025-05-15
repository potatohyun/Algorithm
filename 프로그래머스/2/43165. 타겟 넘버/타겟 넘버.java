import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        l = numbers.length;
        t = target;
        answer = 0;
        dfs(-1,0,numbers);
        return answer;
    }
    public static int l, t, answer;
    
    public static void dfs(int idx, int sum, int[] numbers){
        idx +=1;
        if(idx == l){
            if (sum == t)
                answer++;
            return;
        }
        dfs(idx,sum+numbers[idx],numbers);
        dfs(idx,sum-numbers[idx],numbers);  
    }
}
import java.util.*;
class Solution {
    public List<Integer> solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            int cnt=0;
            for(int j=i;j<prices.length;j++){
                if (prices[i] > prices[j] || j == prices.length-1) {
                    answer.add(cnt);
                    break;
                }
                else{
                    cnt++;
                }
            }
            // System.out.println(prices[i]);
        }
        return answer;
    }
}
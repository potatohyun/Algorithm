import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int len = citations.length;
        
        for (int i=len-1; i>=0;i--){
            // System.out.println(len-i+" "+citations[i]);
            if (len-i == citations[i]){
                answer = citations[i];
                break;
            }
            else if(len-i>citations[i]){
                answer = len-i-1;
                break;
            }
            else if(i==0){
                answer = len;
            }
        }
        // System.out.println(answer);
        return answer;
        
    }
}
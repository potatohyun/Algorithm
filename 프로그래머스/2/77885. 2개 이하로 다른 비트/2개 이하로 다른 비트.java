import java.util.*;
class Solution {
    public List<Long> solution(long[] numbers) {
        List<Long> answer = new ArrayList<>();
        for(long num : numbers){
            String bin = Long.toBinaryString(num);
            // System.out.println(bin);
            
            // 짝수라면 제일 오른쪽을 1로 바꿔준다
            if(num%2==0){
                bin = bin.substring(0, bin.length()-1)+"1";
                answer.add(Long.parseLong(bin, 2));
                // lastIndexOf("0")
            }
            // 홀수라면 가장 오른쪽 1을 0으로, 그의 오른쪽을 1로 바꾼다.
            else{
                bin = "0"+ bin;
                String tmp = "";
                tmp = bin.substring(0, bin.lastIndexOf("0"))+"10";
                if(bin.lastIndexOf("0")+2<=bin.length()){
                    tmp +=bin.substring(bin.lastIndexOf("0")+2, bin.length());
                }
                answer.add(Long.parseLong(tmp, 2));
            }
            
            
        }
        return answer;
    }
}
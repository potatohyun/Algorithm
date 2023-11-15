import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        Arrays.sort(numbers);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i !=j &&!answer.contains(numbers[i]+numbers[j])){
                    answer.add(numbers[i]+numbers[j]);
                }
            }
        }
        Collections.sort(answer);
        // Arrays.sort(answer);
        return answer;
    }
}
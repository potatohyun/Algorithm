import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        ArrayList<String> wl = new ArrayList<>();
        int index = 0;
        char lastChar = words[0].charAt(0);
        

        
        while(true){
            if (index == words.length){
                return answer;
            }
            // System.out.println(lastChar + " " +!wl.contains(words[index])+ " " +words[index].charAt(0));
            if (!wl.contains(words[index]) && lastChar == words[index].charAt(0)){
                lastChar = words[index].charAt(words[index].length() - 1);
                wl.add(words[index]);
                index++;
                
            }
            else{
                System.out.println(index);
                answer[0] = index%n+1;
                answer[1] = index/n+1;
                // {index%n,index/n};
                break;
            }
        }
        return answer;
    }
}
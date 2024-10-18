import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int[] l = new int[progresses.length];
        // int cnt = 0;
        int pre = 0;
        for(int i=0;i<progresses.length;i++){
            int tmp = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0) tmp++;
            if(st.isEmpty()) {
                st.push(tmp);
                pre = tmp;
            }else if(pre >= tmp){
                st.push(tmp);
            }else{
                answer.add(st.size());
                st.clear();
                st.push(tmp);
                pre = tmp;
            }
        }
        answer.add(st.size());
        return answer;
    }
}
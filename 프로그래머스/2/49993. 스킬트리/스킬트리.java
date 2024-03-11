import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String st:skill_trees){
            int idx = 0;
            Stack<Integer> learn = new Stack<>();
            System.out.println(st);
            for(int i=0;i<st.length();i++){
                
                int tmp = skill.indexOf(st.charAt(i));
                if (tmp != -1){
                    if(learn.empty()&&tmp==0){
                        learn.push(tmp);
                    }
                    else if (!learn.empty() && (learn.contains(tmp) || (learn.peek()+1 == tmp))) {
                        learn.push(tmp);
                    }
                    else{
                        break;
                    }
                }
                if(i == st.length()-1){
                    answer++;
                }
            }
            
            
        }
        return answer;
    }
}
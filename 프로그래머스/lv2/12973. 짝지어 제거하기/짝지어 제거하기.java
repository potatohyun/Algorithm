import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        char[] ss = s.toCharArray();
        //s.toCharArray()
        //equals는 문자열함수임
        //""는 스트링, ''는 문자
        
        for(int i=0; i < ss.length ; i ++ ){
            if(stack.size() == 0){
                stack.push(ss[i]);
            }     
            else if(stack.peek() == ss[i]){
                stack.pop();
            }
            else{
                stack.push(ss[i]);
            }
            
        }
        if(stack.size() == 0){
            answer = 1;
        }

        return answer;
    }
}

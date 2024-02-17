import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2,s.length()-2);
        s = s.replace("},{","-");
        String[] str = s.split("-"); 
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        for(String ss:str){
            String[] lst = ss.split(",");
            for(String l: lst){
                int ll = Integer.valueOf(l);
                if(!answer.contains(ll)){  
                    // System.out.println(l);
                    answer.add(ll);
                }
            }
        }
        return answer;
    }
}
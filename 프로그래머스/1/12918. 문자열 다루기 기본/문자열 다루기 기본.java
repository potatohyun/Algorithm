class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        if (s.length() == 4 || s.length() == 6){
        }else{
            return false;
        }
        for(char c : ch){
            int tmp = (int)c;
            if (48<=c && c < 60){
                continue;
            }else{
                answer =false;   
            }
            // System.out.println(tmp);
            // if (tmp >=65 && 65<=tmp<91){
            //     answer = false;
            // }else if(tmp >= 97 && tmp<123){
            //     answer = false;
            // }
        }
        
        return answer;
    }
}
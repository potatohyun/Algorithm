class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] s_lst = s.toCharArray();
        
        for(char ss: s_lst){
            int tmp = (int)ss;
            if(tmp==32){
                answer += (char)tmp;
                continue;
            }
            //대문자
            if (Character.isUpperCase(ss)){
                tmp+=n;
                if(tmp>90){
                    tmp = 64 + (tmp - 90);
                }
            }
            //소문자
            else{
                tmp+=n;
                if(tmp>122){
                    tmp = 96 + (tmp - 122);
                }
            }
            answer += (char)tmp;
        }
        return answer;
    }
}
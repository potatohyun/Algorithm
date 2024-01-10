class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int zero_cnt = 0;

        while(!s.equals("1")){
            int l = s.length();
            
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < l; i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    zero_cnt++;
                }else{
                    sb.append(c);
                }
            }
            s = Integer.toBinaryString(sb.length());
            // System.out.println(zero_cnt+" "+s);
            answer[0]+=1;
        }
        answer[1] = zero_cnt;
        
//         String binary = Integer.toBinaryString(decimal); // 10 -> 2
//         nt binaryToDecimal = Integer.parseInt("1010", 2); // 2 ->10
        
        return answer;
    }
}
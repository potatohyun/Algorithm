class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        // return words;
        for (int i=0; i<words.length; i++){
            // System.out.println("|"+words[i]+"|");
            if(words[i].isEmpty()){
                answer += " ";
                continue;
                // System.out.println("----");
            }
            String tmp = words[i].trim();
            char[] ch = tmp.toCharArray();
            for (int j=0; j<ch.length; j++){
                // System.out.println("ch "+ch[j]+" "+ch.length);
                
                if (j % 2 == 0){
                    answer += Character.toUpperCase(ch[j]);
                    // System.out.println();
                }
                else{
                    // answer+=ch[j];
                    answer+=Character.toLowerCase(ch[j]);
                }
            }
            if(i != words.length-1){
                answer += " ";
            }
        }
        if(answer.length() < s.length()){
            while(answer.length() < s.length()){
                answer += " ";
            }
        }
        return answer;
    }
}
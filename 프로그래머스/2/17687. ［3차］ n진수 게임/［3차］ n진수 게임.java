class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        String js ="";
        int num = 0;
        while(js.length()<t*m){
            js+=Integer.toString(num,n);
            num++;
        }
        // System.out.println(js);
        p--;
        for (int i=0;i<t;i++){
            answer+=js.charAt(p);
            p+=m;
        }
        // answer.toUpperCase();
        return answer.toUpperCase();
    }
}
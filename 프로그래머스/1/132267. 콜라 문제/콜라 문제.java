class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int tmp = n/a;
            n-=tmp*a;
            n+=tmp*b;
            answer+=tmp*b;
            
            // int tmp = n/a;
            // answer += tmp;
            // if(n%a!=0){
            //     tmp+=n%a;
            // }
            // n = tmp;
        }
        return answer;
    }
}
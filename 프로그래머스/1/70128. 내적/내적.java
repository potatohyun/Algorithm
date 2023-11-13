class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int ll = a.length;
        for(int i=0; i<ll; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}
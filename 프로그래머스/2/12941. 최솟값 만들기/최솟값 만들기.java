import java.util.Arrays;
import java.util.Collections;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int l = A.length;
        
        for (int i=0; i < l; i++){
            answer += A[i] * B[l-1-i];
        }
        
        // Arrays.sort(B, (a, b) -> Integer.compare(b, a));
        // System.out.println(Arrays.toString(B));
        

        return answer;
    }
}
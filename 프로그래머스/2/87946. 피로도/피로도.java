import java.util.*;
class Solution {
    static int answer = 0;
    static int[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new int[dungeons.length];
        dj(0,k,dungeons);
        return answer;
    }
    public void dj(int a, int k, int[][] dungeons){
        for (int i=0; i < dungeons.length; i++){
            if(visited[i]==1 || dungeons[i][0]>k) continue;
            visited[i]=1;
            a++;
            dj(a,k-dungeons[i][1],dungeons);
            visited[i]=0;
            a--;
        }
        answer = Math.max(a, answer);
    }
}
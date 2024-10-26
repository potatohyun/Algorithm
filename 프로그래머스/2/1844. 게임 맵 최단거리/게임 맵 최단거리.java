import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length, m = maps[0].length;
        return bfs(n,m,maps);
    }
    
    static int[] dx = {-1, 1, 0, 0}; //상하좌우
    static int[] dy = {0, 0, -1, 1}; //상하좌우
    
    public int bfs(int n, int m, int[][] maps){
        int[][] visited = new int[n][m];
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0));
        visited[0][0] = 1;
        while(!q.isEmpty()){
            Point p = q.poll();
            // if (p.x == n-1 && p.y == m-1) return visited[p.x][p.y];
            for (int i=0;i<4;i++){
                int nx = p.x+dx[i];
                int ny = p.y+dy[i];
                if (nx == n-1 && ny == m-1) return visited[p.x][p.y] + 1;
                if(nx<n && nx >= 0 && ny<m && ny >= 0 
                   && maps[nx][ny]==1 && visited[nx][ny]==0){
                    visited[nx][ny] = visited[p.x][p.y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }
        return -1;
    }
    
    public class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        } 
    }
    
}
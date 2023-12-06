import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int n=0;n<name.length;n++){
            map.put(name[n],yearning[n]);
        }
        
        for(int i=0;i<photo.length;i++){
            int cnt=0;
            for(int j=0;j<photo[i].length;j++){
                if (map.get(photo[i][j])!=null){
                    cnt += map.get(photo[i][j]);
                }
                // System.out.println(photo[i][j]+"//"+map.get(photo[i][j]));
            }
            answer[i]=cnt;
            
        }
        
        return answer;
    }
}
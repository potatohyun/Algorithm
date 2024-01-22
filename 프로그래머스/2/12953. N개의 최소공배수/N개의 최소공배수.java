import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int l = arr.length;
        // int[] arr2 = new int[l];
        // List<Integer> arr2 = new ArrayList<>(l);
        System.out.println(1%2);
        boolean flag = true;
        while(flag){
            // answer++;
            for(int i=0; i<l; i++){
                if(answer < arr[i] || answer%arr[i] != 0){
                    answer++;
                    break;
                };
                if(i ==l-1) flag = false;
            }
        }
        return answer;
    }
}
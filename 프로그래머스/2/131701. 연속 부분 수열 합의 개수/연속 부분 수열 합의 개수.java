import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
 
        int start = 1;
        while (start <= len) {
            for (int i = 0; i < len; i++) {
                int value = 0;
                for (int j = i; j < i + start; j++) {
                    value += elements[j % len];
                }
                set.add(value);
            }
            start++;
        }
        return set.size();
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int stan = 0;
        int cnt = 0;

        for (int p = 0; p < progresses.length; p++) {
            int tmp = (int) Math.ceil((100 - progresses[p]) / (double) speeds[p]);
            if (stan == 0) {
                stan = tmp;
                cnt += 1;
            } else if (stan < tmp) {
                answerList.add(cnt);
                stan = tmp;
                cnt = 1;
            } else {
                cnt += 1;
            }
            if (p == progresses.length - 1) {
                answerList.add(cnt);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;

		Stack<Integer> stack = new Stack<>();

		int orderidx = 0;
        
		for (int i = 1; i <= order.length; i++) {
			if (order[orderidx] == i) {
				orderidx++;
				answer++;
				while (stack.size() != 0) {
					int s = stack.peek();
					if (s == order[orderidx]) {
						stack.pop();
						orderidx++;
						answer++;
					} else {
						break;
					}
				}
			} 
            else {
				stack.push(i);
			}
		}
        return answer;
    }
}
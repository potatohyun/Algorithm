import java.util.*;
class Solution {
//     static ArrayList<String> list = new ArrayList<>();
//     static boolean useTickets[];

//     public String[] solution(String[][] tickets) {
//         useTickets = new boolean[tickets.length];

//         dfs(0, "ICN", "ICN", tickets);

//         Collections.sort(list);

//         return list.get(0).split(" ");
//     }

//     static void dfs(int depth, String now, String path, String[][] tickets){
//         if (depth == tickets.length) {
//             list.add(path);
//             return;
//         }

//         for (int i = 0; i < useTickets.length; i++) {
//             if (!useTickets[i] && now.equals(tickets[i][0])) {
//                 useTickets[i] = true;
//                 dfs(depth+1, tickets[i][1], path + " " +tickets[i][1], tickets);
//                 useTickets[i] = false;
//             }
//         }
//     }
    public List<String> solution(String[][] tickets) {
        answer = new ArrayList<>();
        Stack<String> st = new Stack<>();
        st.add("ICN");
        int[] visited = new int[tickets.length];
        dfs(st, visited, tickets);
        // System.out.println(answer);
        Collections.sort(answer, new CustomSort());
        return answer.get(0);
    }
    static List<List<String>> answer;
    public void dfs(Stack<String> st, int[] visited, String[][] tickets){
        if(st.size()==tickets.length+1) {
            Stack<String> res = new Stack<>();
            for (String s : st) {
                res.push(s);
            }
            answer.add(new ArrayList(res));
            return;
        }
        else{
            for(int i=0; i <tickets.length ;i++){
                if(visited[i]==0 && tickets[i][0].equals(st.peek())){
                    visited[i]=1;
                    st.add(tickets[i][1]);
                    dfs(st, visited, tickets);
                    visited[i]=0;
                    st.pop();
                }
            }
        }
    }
    // 이중배열 정렬은 두 블로그 참고
    //https://velog.io/@ardan0128/Java-2%EC%B0%A8%EC%9B%90-%EB%A6%AC%EC%8A%A4%ED%8A%B8-%EC%A0%95%EB%A0%AC#%ED%85%8C%EC%8A%A4%ED%8A%B8-%EB%8D%B0%EC%9D%B4%ED%84%B0
    //https://romcanrom.tistory.com/136
    // public class CustomSort implements Comparator<List<String>> {
    //     @Override
    //     public int compare(List<String> o1, List<String> o2) {
    //         if(!o1.get(0).equals(o2.get(0))){
    //             return o1.get(0).compareToIgnoreCase(o2.get(0));
    //         } else if(o1.get(0).equals(o2.get(0))){
    //             return o1.get(1).compareToIgnoreCase(o2.get(1));
    //         }
    //         return 0;
    //     }
    // }
    public class CustomSort implements Comparator<List<String>> {
        public int compare(List<String> o1, List<String> o2) {
            for (int i = 0; i < o1.size(); i++) {
                String s1 = o1.get(i);
                String s2 = o2.get(i);

                if (!s1.equals(s2)) {
                    return s1.compareTo(s2);
                }
            }
            return 0;
        }
    }

}
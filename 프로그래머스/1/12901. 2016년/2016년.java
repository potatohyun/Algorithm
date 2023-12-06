class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        a-=1;
        if(a !=0){ //b=12
            while(a!=0){
                
                // b = b%7; //5
                b += date[a-1]; // 43
                a-=1;
            }
            // b = b%7; 
        }
        b = b%7; //1
        if (b == 0){
            return "THU";
        }
        
        // System.out.println(b%7);
        return day[b-1];
    }
}
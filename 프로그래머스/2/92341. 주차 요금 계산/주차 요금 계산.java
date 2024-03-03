import java.util.*;
class Solution {
    public List<Integer> solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        //기본 시간(분)	기본 요금(원)	단위 시간(분)	단위 요금(원)
        //시각 차량번호 내역
        
        HashMap<String,Integer> fee = new HashMap<>();
        HashMap<String,Integer> parking = new HashMap<>();
        for (String record:records){
            // System.out.println(record);
            String[] car = record.split(" ");
            if(car[2].equals("IN")) {
                parking.put(car[1],toMin(car[0]));
            }
            else{
                // 과거 주차 이력이 없는 경우
                if(fee.get(car[1])==null){
                    fee.put(car[1],toMin(car[0])-parking.get(car[1]));
                    // parking.remove(car[1]);
                }
                // 과거 주차 이력이 있는 경우
                else{
                    int sum = fee.get(car[1]) + toMin(car[0])-parking.get(car[1]);
                    fee.put(car[1],sum);
                }
                parking.remove(car[1]);
            }
        }
        // 남은차 정산
        parking.forEach((key, value) -> {
            // System.out.println(key + " : " + value + " was left " );	
            // 과거 주차 이력이 없는 경우
            if(fee.get(key)==null){
                fee.put(key,1439-value);
            }
            // 과거 주차 이력이 있는 경우
            else{
                int sum = fee.get(key) + 1439-value;
                fee.put(key,sum);
            }
        });	
        
        // 정렬
        List<String> keySet = new ArrayList<>(fee.keySet());
        Collections.sort(keySet);
        
        // 출력
        for (String key : keySet) {
            // System.out.print("Key : " + key);
            // System.out.println(", Val : " + fee.get(key));
            if(fee.get(key)<=fees[0]){
                answer.add(fees[1]);
            }
            else{
                if((fee.get(key)-fees[0])%fees[2]==0) answer.add(fees[1] + ((fee.get(key)-fees[0])/fees[2])*fees[3]);
                else{
                    answer.add(fees[1] + ((fee.get(key)-fees[0])/fees[2]+1)*fees[3]);
                }
            }
        }
        
        return answer;
    }
    
    
    public int toMin(String time){
        String[] tmp = time.split(":");        
        return Integer.parseInt(tmp[0])*60+Integer.parseInt(tmp[1]) ;
    }
}
// import java.util.*;

// class Solution {
//     public int solution(String str1, String str2) {
//         int answer = 0;
//         ArrayList<String> list1 = new ArrayList<>();
// 		ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<String> arr1 = new ArrayList<>();
// 		ArrayList<String> arr2 = new ArrayList<>();
//         // 다중 집합 만들기 
// 		for(int i = 0; i < str1.length()-1; i++) {
// 			char a = str1.charAt(i);
// 			char b = str1.charAt(i+1);
// 			// 문자만 가진 경우만 추가 
// 			if(Character.isLetter(a) && Character.isLetter(b)) {
// 				String str = Character.toString(a) + Character.toString(b);
// 				list1.add(str);
// 			}
// 		} 
// 		for(int i = 0; i < str2.length()-1; i++) {
// 			char a = str2.charAt(i);
// 			char b = str2.charAt(i+1);
// 			// 문자만 가진 경우만 추가 
// 			if(Character.isLetter(a) && Character.isLetter(b)) {
// 				String str = Character.toString(a) + Character.toString(b);
// 				list2.add(str);
// 			}
// 		}
//         // 중복 원소 처리를 위해 두 집합 정렬
// 		Collections.sort(list1);
// 		Collections.sort(list2);
//         // 교집합 구하기 
// 		for(String s : list1) {
// 			if(list2.remove(s)) { // 집합1에 집합2가 포함된다면 삭제후, 교집합에 추가 
// 				arr1.add(s);
// 			}
// 			arr2.add(s);
// 		}
		
// 		// 합집합 구하기 
// 		for(String s : list2) { // 교집합에서 제외된 것 뺀 나머지 합집합에 추가 
// 			arr2.add(s);
// 		}
        
// //         HashSet<String> arr1 = new HashSet<String>();
// //         HashSet<String> arr2 = new HashSet<String>();
// //         //소문자로 변환
// //         str1 = str1.toLowerCase();
// //         str2 = str2.toLowerCase();
        
// //         //교집합
// //         for (int s=0; s<str1.length()-1;s++){
// //             char a = str1.charAt(s);
// // 			char b = str1.charAt(s+1);
// // 			// 문자만 가진 경우만 추가 
// // 			if(Character.isLetter(a) && Character.isLetter(b)) {
// // 				String str = Character.toString(a) + Character.toString(b);
// //                 if (str2.contains(str)){
// //                     arr1.add(str);
// //                 }
// //                 arr2.add(str);
// // 			}
// //         }
        
// //         //합집합
// //         for (int s=0; s<str2.length()-1;s++){
// //             char a = str2.charAt(s);
// // 			char b = str2.charAt(s+1);
// //             if(Character.isLetter(a) && Character.isLetter(b)) {
// // 				String str = Character.toString(a) + Character.toString(b);
// //                 arr2.add(str);
// // 			}
// //         }
// //       //   double result = (double)num1/num2;
// //       // String formattedResult = String.format("%.2f", result);
//         // System.out.println(arr1.size());
//         // System.out.println(arr2.size());
// //         // System.out.println(String.format("%.0f", (double)arr1.size()/arr2.size()*65536));
// //         // System.out.println((int)((double)arr1.size()/arr2.size()*65536));
//         // int len1=0;
//         // int len2=0;
//         // if (arr1.size()==0){
//         //     len1 = 1;
//         // }else{
//         //     len1=arr1.size();
//         // }
//         // if (arr2.size()==0){
//         //     len1 = 1;
//         // }else{
//         //     len2=arr2.size();
//         // }
//         // return (int)((double)len1/len2*65536);
//     }
// }
import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
		str1 = str1.toUpperCase(); // 모두 대문자로 
		str2 = str2.toUpperCase();
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		ArrayList<String> union = new ArrayList<>();
		ArrayList<String> intersection = new ArrayList<>();

		// str1 다중 집합 만들기 
		for(int i = 0; i < str1.length()-1; i++) {
			char a = str1.charAt(i);
			char b = str1.charAt(i+1);

			// 문자만 가진 경우만 추가 
			if(Character.isLetter(a) && Character.isLetter(b)) {
				String str = Character.toString(a) + Character.toString(b);
				list1.add(str);
			}
		}

		// str2 다중 집합 만들기 
		for(int i = 0; i < str2.length()-1; i++) {
			char a = str2.charAt(i);
			char b = str2.charAt(i+1);

			// 문자만 가진 경우만 추가 
			if(Character.isLetter(a) && Character.isLetter(b)) {
				list2.add(Character.toString(a) + Character.toString(b));
			}
        }

		// 중복 원소 처리를 위해 두 집합 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		
		// 교집합 구하기 
		for(String s : list1) {
			if(list2.remove(s)) { // 집합1에 집합2가 포함된다면 삭제후, 교집합에 추가 
				intersection.add(s);
			}
			union.add(s);
		}
		
		// 합집합 구하기 
		for(String s : list2) { // 교집합에서 제외된 것 뺀 나머지 합집합에 추가 
			union.add(s);
		}
        
		// 자카드 유사도 구하기 
		double a = intersection.size();
		double b = union.size();

   		double jakard = 0;
	
		if(union.size() == 0)
			jakard = 1;	// 공집합일 경우 1
		else
			jakard = (double) intersection.size() / (double) union.size();

		return (int) (jakard * 65536);
    }
}
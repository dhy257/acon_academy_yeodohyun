package day5.이름.이름궁합계산기;

import java.util.HashMap;
import java.util.Map;

public class MatchCountCalc implements MatchCalculator{
	
	private static final Map<Character, Integer> 초성획수 = new HashMap<>();
	private static final Map<Character, Integer> 중성획수 = new HashMap<>();
	private static final Map<Character, Integer> 종성획수 = new HashMap<>();
	
	static {
		// 초성 19개 전체
	    초성획수.put('ㄱ', 2); 초성획수.put('ㄲ', 4); 초성획수.put('ㄴ', 2);
	    초성획수.put('ㄷ', 3); 초성획수.put('ㄸ', 6); 초성획수.put('ㄹ', 5);
	    초성획수.put('ㅁ', 4); 초성획수.put('ㅂ', 4); 초성획수.put('ㅃ', 8);
	    초성획수.put('ㅅ', 2); 초성획수.put('ㅆ', 4); 초성획수.put('ㅇ', 1);
	    초성획수.put('ㅈ', 3); 초성획수.put('ㅉ', 6); 초성획수.put('ㅊ', 4);
	    초성획수.put('ㅋ', 3); 초성획수.put('ㅌ', 4); 초성획수.put('ㅍ', 4);
	    초성획수.put('ㅎ', 3);
	    
	    // 중성 21개 전체
	    중성획수.put('ㅏ', 2); 중성획수.put('ㅐ', 3); 중성획수.put('ㅑ', 3);
	    중성획수.put('ㅒ', 4); 중성획수.put('ㅓ', 2); 중성획수.put('ㅔ', 3);
	    중성획수.put('ㅕ', 3); 중성획수.put('ㅖ', 4); 중성획수.put('ㅗ', 2);
	    중성획수.put('ㅘ', 4); 중성획수.put('ㅙ', 5); 중성획수.put('ㅚ', 3);
	    중성획수.put('ㅛ', 3); 중성획수.put('ㅜ', 2); 중성획수.put('ㅝ', 4);
	    중성획수.put('ㅞ', 5); 중성획수.put('ㅟ', 3); 중성획수.put('ㅠ', 3);
	    중성획수.put('ㅡ', 1); 중성획수.put('ㅢ', 2); 중성획수.put('ㅣ', 1);
	    
	    // 종성 27개 (받침 없음 제외)
	    종성획수.put('ㄱ', 2); 종성획수.put('ㄲ', 4); 종성획수.put('ㄳ', 4);
	    종성획수.put('ㄴ', 2); 종성획수.put('ㄵ', 5); 종성획수.put('ㄶ', 5);
	    종성획수.put('ㄷ', 3); 종성획수.put('ㄹ', 5); 종성획수.put('ㄺ', 7);
	    종성획수.put('ㄻ', 9); 종성획수.put('ㄼ', 9); 종성획수.put('ㄽ', 7);
	    종성획수.put('ㄾ', 9); 종성획수.put('ㄿ', 9); 종성획수.put('ㅀ', 8);
	    종성획수.put('ㅁ', 4); 종성획수.put('ㅂ', 4); 종성획수.put('ㅄ', 6);
	    종성획수.put('ㅅ', 2); 종성획수.put('ㅆ', 4); 종성획수.put('ㅇ', 1);
	    종성획수.put('ㅈ', 3); 종성획수.put('ㅊ', 4); 종성획수.put('ㅋ', 3);
	    종성획수.put('ㅌ', 4); 종성획수.put('ㅍ', 4); 종성획수.put('ㅎ', 3);
	}

	@Override
	public int matchCalculate(String name1, String name2) {
		int[] arr1 = nameToStroke(name1);
		int[] arr2 = nameToStroke(name2);
		int[] mergedArrays = mergeArrays(arr1, arr2);
		int result = calculateCompatibility(mergedArrays);
		
		return result;
	}
	
	// 이름을 -> 획수
	private int[] nameToStroke(String name) {
		int[] strokes = new int[name.length()];
		for(int i=0;i<name.length();i++) {
			strokes[i]= getCharStroke(name.charAt(i));
		}
		return strokes;
	}
	
	
	// 글자를 -> 획수로
	private int getCharStroke(char ch) {
	    int code = ch - 0xAC00;
	    int 초성idx = code / (21 * 28);  // 수정!
	    int 중성idx = (code % (21 * 28)) / 28;  // 수정!
	    int 종성idx = code % 28;  // 수정!
	    
	    // 19개 전체
	    char[] 초성 = {'ㄱ','ㄲ','ㄴ','ㄷ','ㄸ','ㄹ','ㅁ','ㅂ','ㅃ','ㅅ',
	                  'ㅆ','ㅇ','ㅈ','ㅉ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
	    
	    // 21개 전체
	    char[] 중성 = {'ㅏ','ㅐ','ㅑ','ㅒ','ㅓ','ㅔ','ㅕ','ㅖ','ㅗ','ㅘ',
	                  'ㅙ','ㅚ','ㅛ','ㅜ','ㅝ','ㅞ','ㅟ','ㅠ','ㅡ','ㅢ','ㅣ'};
	    
	    // 28개 전체 (첫 번째는 받침 없음)
	    char[] 종성 = {' ','ㄱ','ㄲ','ㄳ','ㄴ','ㄵ','ㄶ','ㄷ','ㄹ','ㄺ',
	                  'ㄻ','ㄼ','ㄽ','ㄾ','ㄿ','ㅀ','ㅁ','ㅂ','ㅄ','ㅅ',
	                  'ㅆ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
	    
	    int total = 초성획수.get(초성[초성idx]) + 중성획수.get(중성[중성idx]);
	    if (종성idx > 0) {
	        total += 종성획수.get(종성[종성idx]);
	    }
	    return total;
	}
	
	
	// 배열 합치기
	private int[] mergeArrays(int[] arr1, int[] arr2) {
		// 더 긴 배열 길이 찾기
	    int maxLength = Math.max(arr1.length, arr2.length);
	    
	    // 결과 배열 크기 = 더 긴 길이 * 2
	    int[] result = new int[maxLength * 2];
	    
	    // 교차로 채우기
	    for(int i = 0; i < maxLength; i++) {
	        // arr1이 i번째 값이 있으면 넣고, 없으면 0
	        result[i * 2] = (i < arr1.length) ? arr1[i] : 0;
	        
	        // arr2도 마찬가지
	        result[i * 2 + 1] = (i < arr2.length) ? arr2[i] : 0;
	    }
	    return result;
	}
	
	
	// 10을 넘으면 1의 자리수 반환하는 거
	private int calculateCompatibility(int[] nums) {
        int[] current = nums;
        while (current.length > 2) {
            int[] next = new int[current.length - 1];
            for (int i = 0; i < next.length; i++) {
                next[i] = (current[i] + current[i + 1]) % 10;
            }
            current = next;
        }
        return current[0] * 10 + current[1];
    }

}

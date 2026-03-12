package com.acorn.dhy;

public class MyLib {

	public static String 오늘의운세() {
		String[] today = {
				//
				"생각지도 못한 곳에서 작은 행운이 찾아오니, 주변을 세심하게 살펴보는 하루를 보내세요.", //
				"서두르기보다는 천천히 한 걸음씩 나아갈 때, 비로소 원하는 목적지에 닿을 수 있습니다.", //
				"오랫동안 고민하던 일에 대한 해결의 실마리가 풀리고, 마음의 짐을 덜게 될 것입니다.", //
				"오늘은 타인의 의견에 귀를 기울이기보다, 자신의 직관을 믿고 밀고 나가는 것이 유리합니다.", //
				"새로운 인연이 당신의 일상에 긍정적인 활력을 불어넣어 줄 기분 좋은 예감이 드는 날입니다."//
		};
		int index = (int) (Math.random() * today.length); // 0.9999*5 0.0~ 4.9999 => 0~4 이내 랜덤 값
		String 운세 = today[index];
		return 운세;
	}

//	public static void main(String[] args) {
//		String r = MyLib.오늘의운세();
//		System.out.println(r);
//	}
}

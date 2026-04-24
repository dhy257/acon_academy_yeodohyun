package day08Prac;

public class 페이지구하기실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pageSize = 4; // 한 페이지에 보이는 글의 수
		int grpSize = 5; // [1] [2] [3] [4]
		int totRecords = 37;
		int currentPage = 6;

		// 1그룹 : [1] [2] [3] [4]
		// 2그룹 : [5] [6] [7] [8]

		// 구해야 할 값
		int totalPage;
		int currentGrp; // 핵심 : 현재 페이지에 대한 현재그룹 구하기
		int grpStartPage; //
		int grpEndPage; //

		int remain = totRecords % pageSize;
		if (remain == 0) {
			totalPage = totRecords / pageSize;
		} else {
			totalPage = (totRecords / pageSize) + 1;
		}
//		System.out.println(totalPage); // 10 나올거임

		// 현재 페이지에 대한 현재 그룹 구하기
		int remain2 = currentPage % grpSize;
		if (remain2 == 0) {
			currentGrp = currentPage / grpSize;
		} else {
			currentGrp = (currentPage / grpSize) + 1;
		}
		// 1그룹은 1~4
		// 2그룹은 5~8
		// 3그룹은 9~ 인데 9페이니까 3그룹
//		System.out.println(currentGrp); // 3 나올거임

		grpStartPage = (currentGrp - 1) * grpSize + 1;
		grpEndPage = currentGrp * grpSize;

		// 마지막 grpEndPage 확인 => totalPage보다 크면 갱신 필요
		if (grpEndPage > totalPage) {
			grpEndPage = totalPage;
		}

		System.out.println("현재페이지: " + currentPage);
		System.out.println("전체페이지: " + totalPage);
		System.out.println("현재그룹: " + currentGrp);
		System.out.println("그룹의 시작: " + grpStartPage);
		System.out.println("그룹의 끝: " + grpEndPage);

		for (int i = grpStartPage; i <= grpEndPage; i++) {
			System.out.print("[" + i + "] ");
		}

	}

}

package day08Prac;

public class PagingHandler {
	int pageSize;
	int grpSize;
	int totRecords;
	int currentPage;

	int totalPage;
	int currentGrp; // 핵심 : 현재 페이지에 대한 현재그룹 구하기
	int grpStartPage; //
	int grpEndPage; //

	public PagingHandler(int pageSize, int grpSize, int totRecords, int currentPage) {
		super();
		this.pageSize = pageSize;
		this.grpSize = grpSize;
		this.totRecords = totRecords;
		this.currentPage = currentPage;

		calcPaging();
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getGrpSize() {
		return grpSize;
	}

	public int getTotRecords() {
		return totRecords;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentGrp() {
		return currentGrp;
	}

	public int getGrpStartPage() {
		return grpStartPage;
	}

	public int getGrpEndPage() {
		return grpEndPage;
	}

	private void calcPaging() {
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
	}

	public static void main(String[] args) {
		// 페이지 사이즈 ,그룹 사이즈, 토탈레코드, 현재 페이지
		PagingHandler handler = new PagingHandler(5, 4, 46, 1);
		int totalPage = handler.getTotalPage();
		int currentGrp = handler.getCurrentGrp();
		int grpStartPage = handler.getGrpStartPage();
		int grpEndPage = handler.getGrpEndPage();

		for (int i = grpStartPage; i <= grpEndPage; i++) {
			System.out.print("[" + i + "] ");
		}

	}

}

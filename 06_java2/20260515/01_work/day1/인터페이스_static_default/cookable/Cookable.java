package day1.인터페이스_static_default.cookable;

interface Cookable {

    // 기본 동작을 제공하는 default 메서드
    default void cook() {
        재료준비하기();     
        팬가열하기();
        System.out.println("재료를 넣고 요리를 시작합니다!");
    }
    
    // 재료 준비 - 구현 클래스에서 제공해야 함
    void 재료준비하기();

    
    
    // 팬 예열 - 공통 기능 제공
    default void 팬가열하기() {
        System.out.println("팬을 예열 중입니다...");
    }
}

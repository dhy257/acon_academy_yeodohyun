package 팀플4;

/*
 * 난이도 정의 열거형 클래스
 * */
public enum Difficulty {
    EASY,   // 쉬움: 순수하게 랜덤한 위치 선택
    NORMAL, // 중간: 가장 많은 돌을 뒤집을 수 있는 위치 선택 
    HARD    // 어려움: 판의 위치별 가중치를 고려하여 전략적 선택
}
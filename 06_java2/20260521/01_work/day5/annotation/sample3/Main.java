package day5.annotation.sample3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {	
		/*
		Introduction[] objsToVerify = {
                new Introduction(
                        "한효주", 36, "배우",
                        "무빙 , 독전, 뷰티인사이드" , WeekDay.THE ),
                new Introduction(
                        "울트라", 4, "책",
                        "울트라러닝 ****** 세계 0.1%가 지식을 얻는 방법   2020년 출간"  , WeekDay.MON),             
                new Introduction(
                        "피카소", 0, "화가",
                        "마드리드왕립미술학교 , 이비뇽의 처녀들, 게르니카 ,파블로 루이스 피카소(스페인어: Pablo Ruiz Picasso, 1881년 10월 25일 ~ 1973년 4월 8일)는 스페인 말라가에서 태어나 주로 프랑스에서 미술활동을 한 20세기의 대표적 큐비즘 작가다. 대표작으로 《아비뇽의 처녀들》, 《게르니카》 등이 있다. " , WeekDay.WED),
                new Introduction(
                        "조지", 90, "하버드 교수",
                        " 조지베일런트 75년간  평생 연구결과  =>>1. 좋은배우자, 2. 어려움에 대처하는 자세 (정신건강)  , 3. 금연 , 4. 절주,  5.적당한체중  6. 규칙적인 운동습관 ,  7.공부 (지적호기심, 앎을 확장해 나아가는 것 ) " , WeekDay.MON),
               
                new Introduction("김진명",66,  "작가" ,"김진명. 첫 소설 『무궁화꽃이 피었습니다』 이후 발표하는 책마다 베스트셀러가 되었다."  ,  WeekDay.MON)
        };
		
		*/
		
		Introduction[] obs = {
                new Introduction(
                        "윤라영", 31, "학생",  " 특기 : 한숨쉬기 " , WeekDay.MON ),                   
                new Introduction("유원준",27,  "백수" , " 특징 : 지피티 친구"  ,  WeekDay.WED)
        };
				
		
        List<Introduction> objsVerified = new ArrayList<>();
        
        for (Introduction obj : obs) {
            try {
            	//통과한 객체만 검증된 목록에 담긴다
                objsVerified.add(  객체검즘하기(obj) );
                System.out.println("✅ 통과");
            } catch (Exception e) {
                System.out.println("🛑 반려 : " + e.getMessage());
                e.printStackTrace();
            } finally { // ⭐️
                System.out.println("- - - - -");
            }
        }
        
        
        System.out.println("통과개수=" + objsVerified.size());
	}
	
	
	public static Introduction 객체검즘하기 (Introduction obj) throws Exception {
        Class  objClass = obj.getClass();
        
        

        for (Field f : objClass.getDeclaredFields()) {
            f.setAccessible(true);  //private도 외부에서 접근가능하게 함 

            Object val = f.get(obj);  //객체로 부터 f필드명에 해당하는 값얻어오기
           
            for (Annotation a : f.getAnnotations()) {
                //  첫 글자 외 *으로
                if (a instanceof Blind) {
                    String s = (String) val;
                    f.set(obj, s.substring(0, 1) + "*".repeat(s.length() - 1));
                    //변수의 값을 변화시킴
                }

                //  최대 길이 검증
                if (a instanceof MaxLength) {
                    int maxLen = ((MaxLength) a).value();
                    if (((String) val).length() > maxLen) {
                        throw new Exception(
                                "%s 최대 길이(%d) 초과" + f.getName() +  maxLen);                        
                    }
                }

                

                //  가용 요일 검증
                if (a instanceof WeekDaysAvail) {
                	WeekDaysAvail wda = (WeekDaysAvail) a;
                    WeekDay wd = (WeekDay) f.get(obj);  //요일 값 얻어오기
                    WeekDay[] availables = wda.value(); // 쉴수 있는 정보 얻어오기
                    boolean available = false;
                    for (WeekDay inAvail : availables) {  //열거형의 비교는   == 비교함 . 
                        if (wd == inAvail) available = true;
                    }
                    if (!available) throw new Exception(
                            "해당 요일(%s) 불가 (해당 요일은 쉴수 없어요 !) : "  + wd.getName());
                }
            }
        }

        //  테스트해야 할 메소드 실행
        //  모든 매서드 확인
        for ( Method   m : objClass.getDeclaredMethods()) {
            for (Annotation a : m.getAnnotations()) {
                if (a instanceof TestAndPrint) {
                	TestAndPrint tp = (TestAndPrint) a;
                    String printBefore = tp.before();
                    String printAfter = tp.after();

                    if (!printBefore.isBlank())
                        System.out.println(printBefore);
                    
                    //매소드 호출
                    m.invoke(obj);
                    
                    
                    if (!printAfter.isBlank())
                        System.out.println(printAfter);
                }
            }

        }

        return obj;
    }

   

}

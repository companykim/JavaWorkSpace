package a.b.c;

public class BLMain {
	static int LS = 30;
	
	public static void main(String[] args) {
		boolean b;
		b = true;
		System.out.println(b);
		b = 1 > 2;
		System.out.println(b);
		LS = 40;
		
	}
}

/* null 리터럴
 * 어떠한 레퍼런스 타입의 값으로도 사용 가능
		int n = null; // 기본 데이터 타입에는 사용 불가
		String str = null;
	문자열 리터럴
	이중 인용부호로 묶어서 표현
		"Good", "Morning", "3.19", "26", "a"
	자바에서 문자열은 객체이므로 기본 타입이 아님
	문자열 리터럴은 String 객체로 생성됨 */

/* 변수의 이름: 변수의 이름은 식별자(identifier)의 일종
   변수 이름의 규칙
	식별자는 유니코드 문자와 숫자의 조합(한글 가능!)
	식별자의 첫 문자는 일반적으로 유니코드 문자
	두번째 문자부터는 문자, 숫자, _, $ 등이 가능하다.
	대문자와 소문자는 구별된다.
	식별자의 이름으로 키워드를 사용해서는 안된다. */

/* 변수 이름 관례
클래스명: 각 단어의 첫글자는 대문자로 한다.
변수명, 메소드명: 첫번째 단어는 소문자로 시작되어 2번째 단어부터 첫글자는 대문자로 한다.
상수명: */
// final: 최종적인 값 = 변경될 수 없는 값
package a.b.c;

public class Main { // public: 누구나 사용할 수 있는 클래스, class(분류, 일반명사): 클래스 정의, Main: 클래스 시작
	public static void main(String[] args) { // main: 매소드 이름, String..: 매소드 매개 변수
		//매소드의 반환값이 없음.
		System.out.println("hello world!"); // 문자열 출력
		//콘솔로 출력하는 매소드(system.out.println)
	} // 매소드의 끝
} // 클래스의 끝

//자바의 특징
/* 1. 객체 지향적, 2, 단순, 3, 안전, 4. 이식성, 5. 인터프리트 언어
   6. 분산처리가능, 7. 견고, 8. 멀티스레드 지원, 9. 구조 중립적, 10. 동적 */

// 자바의 가장 큰 장점: write once, run everywhere

// spi(service provider interface) - 확장기능에 필요한 최소한의 조건을 명시하는 인터페이스
// hover
// 소스 안에 public 클래스가 있다면 반드시 소스 파일의 이름은 public 클래스의 이름과 일치하여야 한다.
// 하나의 소스 파일 안에 public 클래스가 2개 이상 있으면 안된다.
// 메소드의 정의
/* public(누구나 호출 가능) static(정적 메서드, 하나 반대: 동적-여러개) void(결과값을 반환하지 않음) main(메소드 이름) (String[] args) (외부에서 주어지는 데이터를 받는 매개 변수) {
    문장1: 여기에 우리가 원하는 작업을 문장으로 작성하여 추가한다. 
 } */
// method signature 

// 자료형: 변수에 저장되는 데이터 타입

/* 기본형 변수 타입의 분류
논리 - boolean (1 byte)
문자 - char (2 byte)
숫자 정수 - byte, short(2 byte), int(4 byte), long (8 byte)
    실수 - float (4 byte), double (8 byte)
*/
// 변수(variable)는 데이터를 담아두는 상자

/* 정수형 리터럴
  리터럴은 x=100;에서 100과 같이 소스코드에 직접 쓰여진 값
 */


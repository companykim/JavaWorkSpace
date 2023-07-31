
public class BitOper {

	public static void main(String[] args) {
		int x = 0b01000000000011111111110101010101;
		System.out.println(x<<1);
		/*int y = 0b10000000000011111111101010101010;
		System.out.println(y);*/
		
		int y = 0b10000000000011111111101010101010;
		System.out.println(y);
	}
}

// 형변환
// 자동적인 형변환
// 피연산자 중 하나가 double형이면 다른 피연산자도 double형으로 변환됨.
// 그렇지 않으면 모든 피연산자는 int형으로 변환된다.

// 결합 규칙
// 동일한 우선 순위의 연산이 있는 경우에 무엇을 먼저 수행하느냐에 대한 규칙
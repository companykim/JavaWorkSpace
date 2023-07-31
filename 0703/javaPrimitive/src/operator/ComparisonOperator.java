package operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		int x = 3, y = 4;
		
		System.out.println((x == y) + " ");
		System.out.println((x != y) + " ");
		System.out.println((x > y) + " ");
		System.out.println((x < y) + " ");
		System.out.println((x <= y) + " ");
	}

}

// 논리 연산자
// && AND 연산, x와 y가 모두 참이면 참, 그렇지 않으면 거짓
// || OR 연산, x나 중에서 하나만 참이면 참, 모두 거짓이면 거짓
// ! NOT 연산, x가 참이면 거짓 x가 거짓이면 참

// 비트 연산자 => 성능
// ~ not
// & and
// ^ exclusive or
// | or
// << 왼쪽으로 x2
// >> 오른쪽으로 /2
// <<< 부호 무시하는 왼쪽
// >>> 부호 무시하는 오른쪽
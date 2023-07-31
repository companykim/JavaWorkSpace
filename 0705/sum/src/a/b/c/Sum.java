package a.b.c;

public class Sum {
	// 1~10의 합을 구하기
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		// while
//		int sum = 0;
//		int i = 1;
//		while (i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("합계: " + sum);
	}

}

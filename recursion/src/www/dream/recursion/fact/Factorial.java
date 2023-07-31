package www.dream.recursion.fact;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(n + "!은 " + fact + "입니다.");
	}

}

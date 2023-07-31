package a.b.factor;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.printf(n + "!은 " + fact + "입니다.");
	}

}

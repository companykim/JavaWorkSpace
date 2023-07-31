package study.util.scanner;

import java.util.Scanner;

public class BigTwo {
	public static void main(String[] args) {
		// 사용자의 입력을 정수로 받고
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int n1 = input.nextInt();
		System.out.print("두번째 정수: ");
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println("큰 수는 " + n1);
		} else {
			System.out.println("큰 수는 " + n2);
		}
	}

}

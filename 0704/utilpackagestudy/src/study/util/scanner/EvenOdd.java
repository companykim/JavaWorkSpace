package study.util.scanner;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// 사용자의 입력을 정수로 받고
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int number = input.nextInt();
		// 입력된 수가 홀수인지 짝수인지 확인하는 프로그램
		if (number % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
			System.out.println("프로그램이 종료되었습니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
			System.out.println("프로그램이 종료되었습니다.");
		}
	}

}

package study.util.scanner;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// 실적목표를 달성했다면 초과금액의 10%를 보너스로 지급하는 프로그램
		
		final int 목표액 = 1000;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요(단위: 만원): ");
		int 실적 = input.nextInt();
		double 보너스 = (실적 - 목표액) * 0.1;
		
		if (실적 >= 1000) {
			System.out.println("실적 달성");
			System.out.println("보너스: " + (int) 보너스 + "만원");
		} else {
			System.out.println("실적 달성 실패");
		}
	}
}
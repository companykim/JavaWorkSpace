package study.util.scanner;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner를 통하여
		
		System.out.print("사각형의 가로를 입력하시오: ");
		int 가로 = in.nextInt();
		System.out.print("사각형의 세로를 입력하시오: ");
		int 세로 = in.nextInt();
		
		double 넓이 = 가로 * 세로;
		double 둘레 = 2.0 * (가로 + 세로);
		
		System.out.printf("사각형의 넓이는 %.1f", 넓이);
		System.out.printf("\n사각형의 둘레는 %.1f", 둘레);
	}
}

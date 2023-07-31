package study.util.scanner;

import java.util.Scanner;

public class CicleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner를 통하여
		
		System.out.print("반지름을 입력하시오: ");
		
		double 반지름 = in.nextDouble();
		double 원면적 = 반지름 * 반지름 * Math.PI;
		System.out.printf("%.2f", 원면적);
	}

}

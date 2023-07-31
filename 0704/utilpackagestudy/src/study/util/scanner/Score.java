package study.util.scanner;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		// 학점을 계산하는 프로그램
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int grade = input.nextInt();
		
		if (grade >= 90) {
			System.out.println("학점 A");
		} else if (grade >= 80) {
			System.out.println("학점 B");
		} else if (grade >= 70) {
			System.out.println("학점 C");
		} else if (grade >= 60) {
			System.out.println("학점 D");
		} else {
			System.out.println("학점 F");
		}
	}
}
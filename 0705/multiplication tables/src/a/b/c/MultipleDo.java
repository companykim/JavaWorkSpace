package a.b.c;

import java.util.Scanner;

public class MultipleDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//목표 단 선택
		int num;
		do {
			System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
			num = input.nextInt();
		} while (num < 2 || num > 9);
		// 1~9 for반복
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}

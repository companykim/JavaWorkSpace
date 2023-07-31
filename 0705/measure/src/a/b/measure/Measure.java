package a.b.measure;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int number = input.nextInt();
		
		System.out.println(number + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.print(i + " ");
		}
	}
}

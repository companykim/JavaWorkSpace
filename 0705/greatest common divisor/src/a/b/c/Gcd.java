package a.b.c;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		int x = input.nextInt();
		int y = input.nextInt();
		int r;
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는 " + x);
	}
}
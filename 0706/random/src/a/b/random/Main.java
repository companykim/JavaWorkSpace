package a.b.random;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rand = random.nextInt(100);
		System.out.println("난수의 개수: ");
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += rand;
		}
		System.out.println("난수 " + num + "개의 합은 " + sum);
	}

}

package a.b.random;

import java.util.Scanner;
import java.util.Random;

public class Guess {

	public static void main(String[] args) {
		// 1~100 정답 만들기
		double rn = Math.random();
		int answer = (int) (rn * 100) + 1;
		
		int userGuess;
		int tryCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("추측값 입력하세요: ");
			userGuess = input.nextInt();
			tryCount++;
			
			if (userGuess > answer) {
				System.out.println("제시한 정수가 높습니다.");
				break;
			} else if (userGuess < answer){
				System.out.print("제시한 정수가 낮습니다.");
			} else {
				break;
			}
		} while (true);
		
		System.out.printf("시도횟수는 %d회입니다.", tryCount);
	}

}

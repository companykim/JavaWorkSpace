package www.dream.assertStudy;

import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dt = scan.nextInt();
		assert(dt >= 1 && dt <= 31);
	}

}

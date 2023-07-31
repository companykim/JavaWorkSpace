package fibo;

public class Main {

	public static void main(String[] args) {
		for (int a = 0, b = 1, c; a + b < 1000; c = b, b = a + b, a = c)
			System.out.print(" " + (a+b));
	}

}

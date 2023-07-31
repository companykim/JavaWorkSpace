package a.b.loop;

public class ShapeDrawer {

	public static void main(String[] args) {
//		drawRect();
//		System.out.println();
		
//		drawTriangle();
//		System.out.println();
		
//		drawInvertedTriangle();
//		System.out.println();
		
//		drawEmptyRect();
		
//		drawEmptyInvertedTriangle();
//		draweqTriangle();
//		drawEmptyeqTriangle();
		drawEmptyInvertedeqTriangle();
		
	}
	public static void drawRect() {
		final int ROWS = 5, COLS = 10;
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * **********
	 * *........*
	 * *........*
	 * *........*
	 * **********
	 */
	
	public static void drawEmptyRect() {
		final int ROWS = 5, COLS = 10;
		for (int r = 0; r < ROWS; r++) {
			
			for (int c = 0; c < COLS; c++) {
				if (r == 0 || r == ROWS - 1 || c == 0 || c == COLS - 1) {
					// 사각형의 경계 위치입니까?
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * * 1
	 * ** 2
	 * *** 3
	 * ********** 10
	 */
	public static void drawTriangle() {
		final int ROOT = 10;
		
		for (int r = 0; r < ROOT; r++) {
			for (int c = 0; c < r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void drawInvertedTriangle() {
		final int ROOT = 10;
		
		for (int r = 0; r < ROOT; r++) {
			for (int c = r; c < ROOT; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * * 1
	 * ** 2
	 * *** 3
	 * ********** 10
	 */
	public static void drawEmptyTriangle() {
		final int ROOT = 10;
		for (int r = 0; r < ROOT; r++) {
			
			for (int c = 0; c < r; c++) {
				if (r == 0 || r == ROOT - 1 || c == 0 || c == r - 1) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * **********10
	 * *** 3
	 * ** 2
	 * * 10
	 */
	public static void drawEmptyInvertedTriangle() {
		final int ROOT = 10;
		
		for (int r = 0; r < ROOT; r++) {			
			for (int c = r; c < ROOT; c++) {
				if (c == 0 || c == ROOT - 1 || r == 0 || r == c) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	
	/** scope: 영역
	 * 2 * r - 1 = c
	 *        *
	 *       ***
	 *      *****
	 *     ******* 
	 */
	public static void draweqTriangle() {
		final int ROWS = 5;
		
		for (int r = 0; r < ROWS; r++) {	// 0 1 2 3 4		
			for (int c = 0; c < ROWS + r; c++) {  // 0 4 0 5 0 6 0 7 0 8
				if (c < ROWS - r - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void drawEmptyeqTriangle() {
		final int ROWS = 5;
		
		for (int r = 0; r < ROWS; r++) {	// 0 1 2 3 4		
			boolean isfirststar = true; // 
			for (int c = 0; c < ROWS + r; c++) {  // 0..4 0..5 0..6 0..7 0..8
				if (c < ROWS - r - 1) {
					System.out.print(" ");
				} else {
					if (isfirststar || r == ROWS - 1 || c == r + ROWS - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					isfirststar = false;
				}
			}
			System.out.println();
		}
	}
	
	public static void drawEmptyInvertedeqTriangle() {
		final int ROWS = 5;
		
		for (int r = 0; r < ROWS; r++) {	// 0 1 2 3 4		
			boolean isfirststar = true; // 
			for (int c = r; c < ROWS + r; c++) {  // 0..4 0..5 0..6 0..7 0..8
				if (c < ROWS - r - 1) {
					System.out.print(" ");
				} else {
					if (isfirststar || r == ROWS - 1 || c == r + ROWS - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					isfirststar = false;
				}
			}
			System.out.println();
		}
	}
}
//복습
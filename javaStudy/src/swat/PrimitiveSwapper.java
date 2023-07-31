package swat;

public class PrimitiveSwapper {
	// over load(다중 적재)
	public static <T> T swap(T px, T py) {
		return px;
	}

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		
		y = PrimitiveSwapper.swap(x, x = y);
		
		System.out.println(x);
		System.out.println(y);
		
	}

}

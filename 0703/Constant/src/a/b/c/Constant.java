package a.b.c;

public class Constant {
	public static void main(String[] args) {
		final double KM_PER_MILE = 1.609344;
		double km;
		double mile = 60.0;
		km = KM_PER_MILE * mile;
		
		System.out.println("60마일은 " + km + "킬로미터입니다.");
	}
}

// double과 float의 차이: 더 정밀한 숫자를 요구할 때 double을 사용함.
package light.year;

public class SpeedCalc {

	public static void main(String[] args) {
		lightYearToClosestStar();
		yearToClosestStarByVoyager();
	}

	private static void lightYearToClosestStar() {
		final int LIGHT_SPEED = 300000; // 빛의 속도, 30만km/sec
		final float DISTANCE_TO_CLOSEST_STAR = 40e12f; // 가장 가까운 별까지의 거리, km
		final int SECONDS_PER_YEAR = 60 * 60 * 24 * 365; // 1년은 몇 초
		long lightDistancePerYear = (long) LIGHT_SPEED * SECONDS_PER_YEAR; // km
		// 광년을 산출해서 출력
		System.out.println(DISTANCE_TO_CLOSEST_STAR / lightDistancePerYear);
	}

	private static void yearToClosestStarByVoyager() {
		final int Voyager_SPEED = 60000; // 6만km/hour
		final float DISTANCE_TO_CLOSEST_STAR = 40e12f; // 가장 가까운 별까지의 거리, km
		final int HOURS_PER_YEAR = 24 * 365; // 1년은 몇 시간
		long voyagerDistancePerYear = (long) Voyager_SPEED * HOURS_PER_YEAR; // km
		// 광년을 산출해서 출력
		System.out.println(DISTANCE_TO_CLOSEST_STAR / voyagerDistancePerYear);
	}
}

// 복습(6/30-7/3)
// uml (undefied mark-up language)
// TDD (테스트 주도 개발)
// 소프프웨어 품질 평가

// package, synchronized, implements, byte, import, instanceof, abstract
// 상수: 변경이 불가능한 숫자

// 7/4

// 수식
//대입 연산자 = 할당 연산자 = 배정 연산자
// 대입 연산자(=)는 왼쪽 변수에 오른쪽 수식의 값을 대입한다.
//덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%)
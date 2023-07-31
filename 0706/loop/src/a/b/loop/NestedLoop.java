package a.b.loop;

public class NestedLoop {

	public static void main(String[] args) {
		int i ,j;
		
		for (i = 1; i < 10; i++, System.out.println()) {
			for (j = 1; j < 10; j++, System.out.print('\t')) {
				System.out.print(i + "*" + j + "=" + i*j);
			}
		}	
	}
}
 // break문 -> 나를 최근접으로 감싸는 반복문을 찾아라.
// continue문 -> 다시 반복문으로 간다.
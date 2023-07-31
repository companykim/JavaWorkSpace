package staticFinalize;

public class ECaller {

	public static void main(String[] args) {
		ECaller a = new ECaller();
		a.doX();
		System.gc(); // gc 쓰레기 처리
		a.doX();
	}
	
	private void doX() {
		for (int i = 0; i < 1000000; i++) {
			Employee a = new Employee();
		}
		
		System.out.println(Employee.count);
	}
}

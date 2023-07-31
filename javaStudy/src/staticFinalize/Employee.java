package staticFinalize;

public class Employee {
	
	static int count = 0;
	int age = 10;
	
	{
		++count;
	}
	
	@Override
	protected void finalize() throws Throwable {
		--count;
		super.finalize();
	}
}

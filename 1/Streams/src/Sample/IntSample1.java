package Sample;

public class IntSample1 implements INTface{

	@Override
	public void gm(String name) {
		System.out.println("Good Morning " + name);
		
	}

	@Override
	public void ga(String name) {
		System.out.println("Good Afternoon " + name);
		
	}

	@Override
	public void gn(String name) {
		System.out.println("Good night " + name);
		
	}
	
	

}

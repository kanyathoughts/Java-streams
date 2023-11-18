package testing.Interface;

public class Main{
	
	public static void main(String[] args) {
		Sample1.display();
		validate(12);
		
	}
	
	public static boolean validate(int value) {
		if (value > 10) {
			System.out.println("true");
		}
		return false;
	}

}


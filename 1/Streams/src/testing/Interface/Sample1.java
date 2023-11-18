package testing.Interface;

public interface Sample1 {

	default void show() {
		System.out.println("Sample1");
	}

	static void display() {
		System.out.println("display");
	}

}

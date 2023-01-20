package Practise;

public interface Parent {
	
	abstract void test();
	
	public default void test1() {
		System.out.println("from public default");
		test5();
		test3();
		test4();
		
	}
	
	public static void test3() {
		System.out.println("from public static");
		
		test5();
		
	}
	
	private void test4() {
		System.out.println("from non static private");
	}
	
	private static void test5() {
		System.out.println("from static private");
	}

}

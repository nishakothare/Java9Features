
package Practise;

public class Child implements Parent{

	@Override
	public void test() {
		System.out.println("from abstract method");
		
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		Parent.test3();
		c.test();
		c.test1();
		
		
	}
	

}

package AbstractAndInterfeces;

abstract class A11 {
	abstract void test();
	void test2()
	{
		System.out.println("Hello");
	}

}
class A22 extends A11
{

	@Override
	void test() {
		System.out.println("hello1");
		
	}
	public static void main(String[] args) {
		A22 a=new A22();
		a.test();
		a.test2();
//		A1 a1=new A1();
//		a1.m1();
		
		
	}
	
}

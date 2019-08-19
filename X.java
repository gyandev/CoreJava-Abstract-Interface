package AbstractAndInterfeces;

abstract class X {
	X(int i)
	{
		System.out.println("X(int i)");
	}
	abstract void test2();

}
abstract class Y extends X
{

	Y(int i) {
	super(90);
	}	
}
abstract class Z extends Y
{

	Z(int i) {
		super(i);
	}
	void test1()
	{
		System.out.println("hello1");
	}
	public static void main(String[] args) {
		
	//	Z z=new Z();
		
	}
	
}

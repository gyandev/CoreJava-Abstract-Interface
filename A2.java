package AbstractAndInterfeces;

abstract class A2 {
	
	A2()
	{
		System.out.println("hello");
	}
}
class W extends A2
{
	W()
	{
		System.out.println("W()");
	}
	public static void main(String[] args) {
		W w=new W();
		System.out.println("done");
	}
}

package AbstractAndInterfeces;

public interface V {
	void test();

}
interface I1 extends V
{
	@Override
	void test();
}
abstract class A3 implements V
{
	void m1()
	{
		System.out.println("hello");
	}
	abstract void m2();
	public static void main(String[] args) {
		A3 a;
		I1 i;
//		i.test();
//		a.m1();
//		a.m2();
	}
}

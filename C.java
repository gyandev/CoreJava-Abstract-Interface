package AbstractAndInterfeces;

public class C extends B1{
	int x;
	
	
	public C(int x, int z, int x2) {
		x = x2;
	}


	public static void main(String[] args) {
		C c=new C(10,20,30);
	}
	
	
}
abstract class B1 
{
	int x;
	int z;
	
	public B1(int x, int z) {
		System.out.println("parametrized Constructors");
		this.x = x;
		this.z = z;
	}

	public B1()
	{
		System.out.println("zero-arg constructors");
	}
}

	
		
	
	
	



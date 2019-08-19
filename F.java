package AbstractAndInterfeces;


class Manager1
{
	int i,j;
	@Override
	public String toString()
	{
		return "i="+i +" ,j=" +j;
	}
}
public class F {
	public static void main(String[] args) {
		Manager1 m1=new Manager1();
		m1.i=10;
		m1.j=20;
		System.out.println(m1);
	}

	
	
}

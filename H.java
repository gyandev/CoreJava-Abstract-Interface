package AbstractAndInterfeces;

class Manager4
{
	int x;
	@Override
	public String toString()
	{
		String s1=super.toString();
		String s2= "x =" +x;
		return s1 + "," +s2;
		
	}
}

public class H {
	public static void main(String[] args) {
		 Manager4 m4=new Manager4();
		 m4.x=200;
		 System.out.println(m4);
	}

}

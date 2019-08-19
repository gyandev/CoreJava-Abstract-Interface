package AbstractAndInterfeces;

class Manager2
{
	int x;
	@Override
	public String toString()
	{
		return "x=" + x;
	}
}
class Manager3
{
	int y;
	Manager2 m2;
	@Override
	public String toString()
	{
		return m2 + " y=" + y;
	}
}

public class G {
	public static void main(String[] args) {
		Manager2 m2=new Manager2();
		m2.x=10;
		Manager3 m3=new Manager3();
		m3.y=20;
		m3.m2=m2;
		System.out.println(m2);
		System.out.println(m3);
	}

}

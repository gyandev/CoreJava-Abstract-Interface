package AbstractAndInterfeces;

class Manager5
{
	int i=10;
}
public class J {
	public static void main(String[] args) {
		Manager5 m5=new Manager5();
		Manager5 m6=new Manager5();
		Manager5 m7=m6;
		System.out.println(m5==m6);
		System.out.println(m6==m7);

	}

}

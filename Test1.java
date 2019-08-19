package AbstractAndInterfeces;

public class Test1 {
	
	int x1;
	public Test1(int x) {
		x1=x;
		System.out.println(this.x1);
	}
	public static void main(String[] args) {
		Test1 t=new Test1(10);
		System.out.println(t.x1);
		
	}

}

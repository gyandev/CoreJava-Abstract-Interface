package AbstractAndInterfeces;

class Person
{
	String name;
	int age;
	@Override
	public String toString()
	{
		String s1="Address" +super.toString();
		String s2= "State:name =" +name +", age ="+ age;
		return s1 + "and" +s2;
		
	}
}

public class I {
	public static void main(String[] args) {
		 Person p1=new Person();
		 p1.name="uttara";
		 p1.age=80;
		 System.out.println(p1);
	}

}

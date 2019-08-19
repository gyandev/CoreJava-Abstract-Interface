package AbstractAndInterfeces;

interface A1{
 public void method1();
 }
 class One implements A1{
 @Override
public void method1(){
 System.out.println("hello");
 }
 }
 class Two extends One{}
 public class Test extends Two{
 public static void main(String[] args)
 {
 A1 a;
 Two t = new Two();
 a = t;
 a.method1();
 }
 }

import java.io.*;
public class Test
{
	static int x = 11;
	private int y = 33;
	public void method1(int x)
	{
		Test t = new Test();
		this.x = 22;
		y = 44;

		System.out.println("Test.x: " + Test.x);//static variable
		System.out.println("t.x: " + t.x);//non-static or instance variable 
		System.out.println("t.y: " + t.y);//instance or non static variable
		System.out.println("y: " + y);//local variable
	}

	public static void main(String args[])
	{
		Test t = new Test();
		t.method1(5);
	}
}

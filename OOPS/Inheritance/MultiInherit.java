interface A {
	void method1();
	void method2();
}
interface B  {
	void method3();
}
class GFG implements B,A {
	public void method1()
	{
		System.out.println("Method 1");
	}
	public void method2()
	{
		System.out.println("Method 2");
	}
	public void method3()
	{
		System.out.println("Method 3");
	}
}
public class MultiInherit {
    public static void main(String[] args) {
        GFG obj=new GFG();
        obj.method1();
        obj.method2();
        obj.method3();
        
    }


}
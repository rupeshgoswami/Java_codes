package DesignPattern;

public class A {
	
	private A()
	{
		
	}
	
	static A b;
	static 
	{
		b=new A();
	}
	public static A getOBJ()
	{
		return b;
		
	}
	
	public  void m1()
	{
		System.out.println("m11");
	}
	
	public  void m2()
	{
		System.out.println("m22");
	}
	public  void m3()
	{
		System.out.println("m33");
	}

}

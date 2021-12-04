package DesignPattern;

public class Chachji {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
		A ob = A.getOBJ();
		System.out.println(ob.hashCode());
		ob.m1();
		ob.m3();
		}
	}

}

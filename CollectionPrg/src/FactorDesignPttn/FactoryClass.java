package FactorDesignPttn;

public class FactoryClass {
	private FactoryClass()
	{
		
	}
	
	public static MyConnection getFactory(String s)
	{
		MyConnection con=null;
		if(s.equals("mysql"))
		{
			con=new Mysql();
		}
		else if(s.equals("Postgres"))
		{
			con=new Postgres();
		}
		else if(s.equals("myOracal"))
		{
			con=new MyOracal();
		}
		return con;
			
	}

}

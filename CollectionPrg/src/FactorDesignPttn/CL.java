package FactorDesignPttn;

public class CL {
	public static void main(String[] args) {
	
		MyConnection con = FactoryClass.getFactory("Postgres ");
		con.getConnection();
	}

}

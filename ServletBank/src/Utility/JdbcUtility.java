package Utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtility {
	JdbcUtility() {

	}

	private static Properties p;
	private static Connection con;
	static {

		try {
			p = new Properties();
			InputStream in = new FileInputStream("D:\\AdvanveJava\\ServletBank\\src\\Utility\\JdbcUtility.java");
			p.load(in);
			Class.forName(p.getProperty("driver"));
			con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("uid"), p.getProperty("pass"));

		} catch (Exception e) {

		}

	}

	public static Connection getconn() {
		return con;

	}

}

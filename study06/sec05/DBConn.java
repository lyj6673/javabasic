package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection conn;
	
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "lsh";
		String pwd = "java";
		
		if(conn==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,user,pwd);
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return conn;
	}

}

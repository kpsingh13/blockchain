package noobchain;

import java.sql.DriverManager;

public class conn {
	String username="postgres";
	String pass="1234";
	String conurl="jdbc:postgres://localhost:5432/service_book";
	
	static connection con=null;
	public static connection geton() {
		try {
			Class.forName("org.postgres.driver");
			con=(connection) DriverManager.getConnection("jdbc:postgres://localhost:5432/service_book/postgres/1234");
		} catch (Exception e) {System.out.print(e);
			// TODO: handle exception
		}
		return con;

	}
}

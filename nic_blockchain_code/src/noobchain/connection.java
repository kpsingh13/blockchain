package noobchain;
import java.sql.*;
public class connection implements conpostgres {

	static connection con=null;
	public static connection geton() {
		try {
			Class.forName("org.postgres.driver");
			con=(connection) DriverManager.getConnection(conurl,username,pass);
		} catch (Exception e) {System.out.print(e);
			// TODO: handle exception
		}
		return con;
		
	}
}

package ComplexTestScenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String dbURL = null,uname = null,password = null;
			Connection con=DriverManager.getConnection(dbURL,uname,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from abc");
			con.close();
	}

}

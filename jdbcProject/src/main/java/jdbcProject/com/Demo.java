package jdbcProject.com;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/student ";
		String uname = "root";
		String password = "abcSHA@123";
		// String qry = "SELECT name from student.student where student_id=1";
		String qry1 = "SELECT * from  student.student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		Statement st = con.createStatement();
		// System.out.println(st);
		ResultSet rs = st.executeQuery(qry1);
		// System.out.println(rs);
		rs.next();
		// String name = rs.getString("name");
		String userData="";
		userData = rs.getInt(1) + ":" + rs.getString(2);
		System.out.println(userData);
		rs.next();
		userData = rs.getInt(1) + ":" + rs.getString(2);
		System.out.println(userData);

		// Call info method
		// log.info("This is message 1");

		st.close();
		con.close();

	}

}

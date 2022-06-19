package jdbcProject.com;

import java.sql.*;

public class SaveData {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/student ";
		String uname = "root";
		String password = "abcSHA@123";
		// String qry = "SELECT name from student.student where student_id=1";
		String qry1 = "INSERT INTO   student.student values(default , 'Saman')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(qry1);

		System.out.println(count + " rows affected");

	}

}

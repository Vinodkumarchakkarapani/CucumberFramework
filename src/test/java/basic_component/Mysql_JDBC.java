package basic_component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.checkerframework.common.reflection.qual.ForName;

public class Mysql_JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost:3306/vtech");
	Statement statement=connection.createStatement();
	ResultSet resultset=statement.executeQuery("SELECT * FROM tb1_login");
	while(resultset.next()) {
		System.out.println("username: "+resultset.getString(1) +"password "+resultset.getString(2));
	}
	}

}

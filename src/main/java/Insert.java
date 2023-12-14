
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	
	
	public static void main(String[] args) {
		try {
			
			// classforName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","praveen");
		
		Statement st= con.createStatement();
		st.executeUpdate("insert into empl values(101,'ram',24000),(103,'amit',2300),(102,'raj',8300)");
		con.close();
		System.out.println("Record is inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","praveen");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from empl");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		con.close();
		}
		catch(Exception e)
		
		{
			e.getStackTrace();
		}
		
	}

}

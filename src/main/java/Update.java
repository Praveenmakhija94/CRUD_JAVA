import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","praveen");
			Statement st=con.createStatement();
			st.executeUpdate("update empl set salary=56000 where Id=103");
			con.close();
			System.out.println("record is update");
		}
		catch(Exception e)
		{
			
		}
	}

}

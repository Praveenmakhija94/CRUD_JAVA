
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","praveen");
		Statement st=con.createStatement();
		st.executeUpdate("delete from empl where Id=101");
		con.close();
		System.out.println("Record is delted");
		
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

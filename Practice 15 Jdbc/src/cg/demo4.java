package cg;
import java.sql.*;
import java.util.Scanner;
public class demo4 {

	public static void main(String[] args){
		
		//load the driver
		try {

			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
			
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false); //tells that do not commit after every dml statement
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Account ID");
			int id=sc.nextInt();
			System.out.println("Enter Mobile No");
			long mb=sc.nextLong();
			System.out.println("Enter AccountHolder Name");
			String name=sc.next();
			System.out.println("Enter balance");
			double bal=sc.nextDouble();
			
			// dynamic query
			String sqlQuery="insert into account values(?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(sqlQuery);
			st.setInt(1,id);
			st.setLong(2,mb);
			st.setString(3,name);
			st.setDouble(4,bal);
			
			int insertedRec= st.executeUpdate();
			System.out.println("Inserted Records"+ insertedRec);
			
			con.commit();
			con.close();
		}
		catch(SQLException e) {
			
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}
	
	
	}
}

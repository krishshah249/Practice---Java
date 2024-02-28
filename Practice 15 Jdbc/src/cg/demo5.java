package cg;
import java.sql.*;
import java.util.Scanner;
public class demo5 {

	public static void main(String[] args) throws SQLException{
		
		Connection con= null;
		PreparedStatement updateSt=null;
		PreparedStatement selectSt=null;
		//load the driver
		try {

			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); // java 8 automatically load
			// driver
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
			
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false); //tells that do not commit after every dml statement
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Account ID");
			int id=sc.nextInt();
			
			selectSt=con.prepareStatement("select * from account where aid=?");
			
			selectSt.setInt(1, id);
			ResultSet rs1=selectSt.executeQuery();
			double bal1=0.0;
			long mb1=0L;
			String ah1="";
			long mb2=0L;
			String ah2="";
			
			if(rs1!=null) {
				if(rs1.next()) {
					mb1=rs1.getLong("mobileno");
					ah1=rs1.getString(3);
					System.out.println(ah1);
					bal1=rs1.getDouble("balance");
					System.out.println("Your balance is"+bal1);
				}
		}
			
			
			System.out.println("Enter another Account ID");
			int id1=sc.nextInt();
			
			selectSt.setInt(1, id1);
			ResultSet rs2=selectSt.executeQuery();
			double bal2=0.0;
			if(rs2!=null) {
				if(rs2.next()) {
					
					mb2=rs2.getLong("mobileno");
					ah2=rs2.getString(3);
					System.out.println(ah2);
					System.out.println(rs2.getString(3));
					bal2=rs2.getDouble("balance");
					System.out.println("Your balance is"+bal2);
				}
		}
			
			System.out.println("Enter amount to transfer");
			double amount =sc.nextDouble();
			
			updateSt= con.prepareStatement("update account set mobileno=?,accountholder=?,balance=? where aid=?");
			
			updateSt.setLong(1,mb1);
			updateSt.setString(2,ah1);
			updateSt.setDouble(3,bal1-amount);
			updateSt.setInt(4,id);
			int i1= updateSt.executeUpdate();
			System.out.println("Account updated"+i1);
			
			updateSt= con.prepareStatement("update account set mobileno=?,accountholder=?,balance=? where aid=?");
			
			updateSt.setLong(1,mb2);
			updateSt.setString(2,ah2);
			updateSt.setDouble(3,bal2+amount);
			updateSt.setInt(4,rs2.getInt("aid"));
			i1= updateSt.executeUpdate();
			System.out.println("Account updated"+i1);
			
//			System.out.println("Enter AccountHolder Name");
//			String name=sc.next();
//			System.out.println("Enter balance");
//			double bal=sc.nextDouble();
//			
//			// dynamic query
//			String sqlQuery="insert into account values(?,?,?,?)";
//			
//			PreparedStatement st = con.prepareStatement(sqlQuery);
//			st.setInt(1,id);
//			st.setLong(2,mb);
//			st.setString(3,name);
//			st.setDouble(4,bal);
//			
//			int insertedRec= st.executeUpdate();
//			System.out.println("Inserted Records"+ insertedRec);
			
			con.commit();
		}
		catch(SQLException e) {
			
			con.rollback();
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Closing Connection");
			if(con!=null)
			con.close();
		}
	
	}
}

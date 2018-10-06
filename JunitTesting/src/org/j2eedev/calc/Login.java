package org.j2eedev.calc;
import java.io.*;
import java.sql.*;  

public class Login{  

	static String email;
	static String pwd;
	static String fname;
	static String lname;
	static StringBuffer result=new StringBuffer();

	public static String valid(String email1, String pwd1,String fname1, String lname1)
	{
		email=email1;
		pwd=pwd1;
		fname=fname1;
		lname=lname1;
		System.out.println("email: "+email);
		System.out.println("password: "+pwd);
		System.out.println("fname: "+fname);
		System.out.println("lname: "+lname);
		Login l =new Login();
		int length = result.length();
		result.delete(0, length);
		l.connection();
		String ans=result.toString();
		System.out.println("end: "+result);
		return ans;
	}
	
	
	public void connection()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/wt","root","mysqlcummins");
			Statement st=con.createStatement();
			ResultSet rs=null;
			String db_pswd=null;
			String db_fname=null;
			String db_lname=null;
			rs = st.executeQuery("select * from users where email='"+email+"'");
			if(rs==null)
			{
				System.out.println("unsuccessfull");
			}
			else
			{
				while(rs.next())
				{
					db_pswd=rs.getString(2);
					db_fname=rs.getString(3);
					db_lname=rs.getString(4);
					
					if(db_pswd.equals(pwd))
					{
						System.out.println("Password Successful");
						result.append("p_Success");
					}
					else
					{
						System.out.println("Password not Successful");
						result.append("p_unsuccess");
					}
					
					if(db_fname.equals(fname))
					{
						System.out.println("fname Successful");
						result.append("f_Success");
					}
					else
					{
						System.out.println("fname not Successful");
						result.append("f_unsuccess");
					}
					
					if(db_lname.equals(lname))
					{
						System.out.println("lname Successful");
						result.append("l_Success");
					}
					else
					{
						System.out.println("lname not Successful");
						result.append("l_unsuccess");
					}
					break;
				}
				
			} 
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}
}
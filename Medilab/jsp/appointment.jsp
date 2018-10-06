<html>
	<head>
		<title>Appointment Submitted</title>
	</head>
	<body>
	<%@page import = "java.io.*" %>
	<%@page import = "java.sql.*" %>
	<h2>Login Form</h2>
	<%
		try
		{
			%>
			inside try<%
			Class.forName("com.mysql.jdbc.Driver");
			
			%>
			After driver<%
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wt","root","mysqlcummins");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
			PreparedStatement st=con.prepareStatement("insert into appointment(name, surname) values(?,?)");
			ResultSet rs=null;
			%>
			Connection established!!
			<%
			String fname=request.getParameter("firstName");
			String lname=request.getParameter("lastName");
			st.setString(1,fname);
            st.setString(2,lname);
			
			int inserted = st.executeUpdate();
			System.out.println(inserted);%>
            Records inserted
            <%

			con.close();
			st.close();
			
		}
		catch (Exception e)
		{
	%>
			error
	<%	}
	%>
	</body>
</html>
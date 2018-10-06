<html>
	<head>
		<title>Register</title>
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
			// PreparedStatement st=con.prepareStatement("insert into appointment(name, surname, gender, phone, age, Bdate, address, symptoms, appType, appDate, facility) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"); 

			PreparedStatement st=con.prepareStatement("insert into register values(?, ?, ?, ?)");
			ResultSet rs=null;
			%>
			Connection established!!
			<%
			String name=request.getParameter("register_name");
			String email=request.getParameter("register_email");
			String pass=request.getParameter("pass");
			String phoneNumber=request.getParameter("number");
			
			st.setString(1, name);
            st.setString(2, email);
			st.setString(3, pass);
			st.setString(4, phoneNumber);
			
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
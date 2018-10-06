<html>
	<head>
		<title>Login Successfully</title>
	</head>
	<body>
	<%@page import = "java.io.*" %>
	<%@page import = "java.sql.*" %>
	<h2>Login Form</h2>
     <script>
     function alert(){
            window.alert("Email or password is not valid");
     }
    </script>
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
            Statement st=con.createStatement();  
			String email=request.getParameter("login_email");
			String pass=request.getParameter("pass");
			//ResultSet result=st.executeQuery("select password from register where email='"+email+"'");
            ResultSet result=st.executeQuery("select * from register");    
			//if(result.getString(1).equals(pass)){
              //  out.println("login");
            //}
            int flag=0;
			while(result.next()){

                if(result.getString("email").equals(email) && result.getString("password").equals(pass)){
                    response.sendRedirect("appointment.html");
                    flag=1;
                    break;
                }
            }
                if(flag!=1){
                    %>
                    <script>
                   alert();
                   </script>
                    <%
                    response.sendRedirect("login.html");
                    
                }
			con.close();
			st.close();
			result.close();
		}
		catch (Exception e)
		{
	%>
			error
	<%	}
	%>
	</body>
</html>
<html>
	<head>
		<title>Appointment Submitted</title>
		<script type="text/javascript">
		function alertFunction(){
			alert ( "Please enter password." );
		}
		</script>
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

			PreparedStatement st=con.prepareStatement("insert into appointment(name, surname, gender, phone, age, Bdate, address, symtoms, appType, appDate, facility, time) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ResultSet rs=null;
			%>
			Connection established!!
			<%
			int flag=0;
			String fname=request.getParameter("firstName");
			String lname=request.getParameter("lastName");
			String gender=request.getParameter("gender");
			String phoneNumber=request.getParameter("phoneNumber");
			String age=request.getParameter("age");
			String birthDate=request.getParameter("birthDate");
			String add1=request.getParameter("address1");
			String add2=request.getParameter("address2");
			String city=request.getParameter("city");
			String region=request.getParameter("region");
			String postalCode=request.getParameter("postalCode");
			String country=request.getParameter("country");
			String comment=request.getParameter("comment");
			String appDate=request.getParameter("appDate");
			String apptype=request.getParameter("apptype");
			String facility=request.getParameter("facility");
			String time=request.getParameter("time");
			int id=0;
			String drName=null;
			 ResultSet result=st.executeQuery("select * from doctors"); 
			 while(result.next()){

                if(result.getString("appType").equals(apptype) && result.getString(time).equals("yes")){
					id=result.getInt("id");
					drName=result.getString("doctor");
					Statement stmt = con.createStatement();
      				String sql = "update doctors set `"+time+"` = 'no' where id="+id;
      				stmt.executeUpdate(sql);
                    flag=1;
                    break;
                }
            }
			if(flag==0){

				%>
				<script> 
				 alertFunction();
				</script>
				<%
				response.sendRedirect("appointment.html");
			}

			st.setString(1,fname);
            st.setString(2,lname);
			st.setString(3,gender);
			st.setString(4,phoneNumber);
			st.setString(5,age);
			st.setString(6,birthDate);
			st.setString(7,add1+" "+add2+" "+city+" "+region+" "+postalCode+" "+country);
			st.setString(8,comment);
			st.setString(9,apptype);
			st.setString(10,appDate);
			st.setString(11,facility);
			st.setString(12,time);

			session.setAttribute("Name",fname+" "+lname);
			session.setAttribute("phoneNumber",phoneNumber);
			session.setAttribute("comment",comment);
			session.setAttribute("appDate",appDate);
			session.setAttribute("time",time);
			session.setAttribute("doctor",drName);
			session.setAttribute("apptype",apptype);
			
			int inserted = st.executeUpdate();
			response.sendRedirect("appLetter.jsp");
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
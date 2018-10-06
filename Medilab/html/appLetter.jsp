<html>
   <head>
      <title>Using GET Method to Read Form Data</title>
   </head>
   <style>
body {
    border-style: solid;
    border-width: 3px;
    border-left-width: 10px;
    background-color: wheat;
    border-right-width: 10px;
    border-color: rgba(28,74,90, 0.9);
    align-content: center;
    margin-right: 30%; 
    margin-left: 30%; 
}
h1{
    color:rgba(28,74,90, 0.9);
    padding: 60px 0px;
    text-align: center;
}
p{
    text-align:right;
    /* margin-left: 10%; */
}
span{
    text-align:left;
    padding-left:10px;
    /* margin-left: 10%; */
}
.myself .property{
  width:30%;
  display:inline-block;
  box-sizing:border-box;
  text-align:right;
  padding-left:5%;
  padding-bottom:2%;
  /* margin-left: 3%; */
  }

.myself .value{
  text-align:left;
  padding-left:2%;
  width:70%;
  display:inline-block;
  box-sizing:border-box;
  }
</style>
   <body>
  
      <h1>Appointment letter</h1>
      
        <%-- <p><b>Name: </b>
           <span> <%= session.getAttribute("Name")%></span>
        </p>
         <p><b>Contact Number:</b>
           <span> <%= session.getAttribute("phoneNumber")%></span>
        </p>
        <p><b>Appointment Date:</b>
           <span> <%= session.getAttribute("appDate")%></span>
        </p>
        <p><b>Appointment Time:</b>
           <span> <%= session.getAttribute("time")%></span>
        </p>
        <p><b>Appointment Type:</b>
         <span><%= session.getAttribute("apptype")%></span>
        </p>
        <p><b>Doctor:</b>
         <span> <%= session.getAttribute("doctor")%> </span>
        </p>

        <p><b>Symtoms:</b>
          <span>  <%= session.getAttribute("comment")%> </span>
         </p> --%>
         <div class="myself">
        <div class="property"><b>Name: </b></div><div class="value"><%= session.getAttribute("Name")%></div> 
        <div class="property"><b>Contact Number:</b></div><div class="value"><%= session.getAttribute("phoneNumber")%></div> 
        <div class="property"><b>Appointment Date:</b></div><div class="value"> <%= session.getAttribute("appDate")%></div> 
        <div class="property"><b>Appointment Time:</b></div><div class="value"><%= session.getAttribute("time")%></div> 
        <div class="property"><b>Appointment Type:</b></div><div class="value"><%= session.getAttribute("apptype")%></div> 
        <div class="property"><b>Doctor:</b></div><div class="value"> <%= session.getAttribute("doctor")%></div>
        <div class="property"><b>Symtoms:</b></div><div class="value"> <%= session.getAttribute("comment")%></div> 

        </div>
         
         <img src="logo.png" alt="Girl in a jacket" style="width:200px;height:100px;position: absolute;
    bottom: 30px;
    right: 35%;
    font-size: 18px;">
      
   </body>
</html>

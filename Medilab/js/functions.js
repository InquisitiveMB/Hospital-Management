
function passCheck()
{
    alert("enye")
    var pass1 = document.getElementById("register_pass").value;
    var pass2 = document.getElementById("repsw").value;
    if(pass1 == pass2)
    {
        alert("password matched.");
        return true;
    }
    else
    {
        alert("password doesn't matched.")
        return false;
    }
}
function nameCheck11()
{
    window.alert("Please enter a valid e-mail address.sjdfnksjndkjnskd");
    var x = document.getElementById("register_name").value;
    if(x=="")
    {
        uname.focus();
        window.alert("Please enter a valid e-mail address.");
        return false;
    }
    var letter = "/^[A-Za-z]+$/";
    if((inputtxt.value.match(letterNumber)))
    {
        alert(" entered valid name.");
     return true;
    }
    else
    { 
    alert("Please enter valid name."); 
    return false; 
    }
} 
function emailCheck_login()
{
    var x = document.getElementById("login_email").value;
    if(x=="")
    {
        ename.focus();
        alert("Please enter a valid e-mail address.");
        return false;
    }
    if(x.indexOf("@")>0)
    {
        if(/(\.\w{2,3})+$/.test(x))
        {
            return true;
        }
        else
        {
            ename.focus();
            alert("Please enter a valid e-mail address.");
            return false;
        }
    }
    else
    {
        ename.focus();
        window.alert("Please enter a valid e-mail address.");
        return false;
    }
} 
function phoneCheck()
{
    var x = document.getElementById("number").value;
    var phoneno = /^\d{10}$/;
    if(x.match(phoneno)){
        return true;
    }
    else{
        number.focus();
        alert("Enter valid Mobile Number");
        return false;
    }
}

function emailCheck_register()
{
    var x = document.getElementById("register_email").value;
    if(x=="")
    {
        ename.focus();
        alert("Please enter a valid e-mail address.");
        return false;
    }
    if(x.indexOf("@")>0)
    {
        if(/(\.\w{2,3})+$/.test(x))
        {
            return true;
        }
        else
        {
            ename.focus();
            alert("Please enter a valid e-mail address.");
            return false;
        }
    }
    else
    {
        ename.focus();
        alert("Please enter a valid e-mail address.");
        return false;
    }
} 

function validPass_login()
{
    var myInput = document.getElementById("login_pass").value;
    // When the user starts to type something inside the password field
    myInput.onkeyup = function() {
      // Validate lowercase letters
        var lowerCaseLetters = /[a-z]/g;
        if(myInput.value.match(lowerCaseLetters)) {  
        letter.classList.remove("invalid");
        letter.classList.add("valid");
    } else {
        letter.classList.remove("valid");
        letter.classList.add("invalid");
    }
      
    // Validate capital letters
    var upperCaseLetters = /[A-Z]/g;
    if(myInput.value.match(upperCaseLetters)) {  
        capital.classList.remove("invalid");
        capital.classList.add("valid");
    } else {
        capital.classList.remove("valid");
        capital.classList.add("invalid");
    }

    // Validate numbers
    var numbers = /[0-9]/g;
    if(myInput.value.match(numbers)) {  
        number.classList.remove("invalid");
        number.classList.add("valid");
    } else {
        number.classList.remove("valid");
        number.classList.add("invalid");
    }
      
      // Validate length
    if(myInput.value.length >= 8) {
        length.classList.remove("invalid");
        length.classList.add("valid");
    } else {
        length.classList.remove("valid");
        length.classList.add("invalid");
      }
    }
}
function validPass_register()
{
    var myInput = document.getElementById("register_pass").value;
    // When the user starts to type something inside the password field
    myInput.onkeyup = function() {
      // Validate lowercase letters
        var lowerCaseLetters = /[a-z]/g;
        if(myInput.value.match(lowerCaseLetters)) {  
        letter.classList.remove("invalid");
        letter.classList.add("valid");
    } else {
        letter.classList.remove("valid");
        letter.classList.add("invalid");
    }
      
    // Validate capital letters
    var upperCaseLetters = /[A-Z]/g;
    if(myInput.value.match(upperCaseLetters)) {  
        capital.classList.remove("invalid");
        capital.classList.add("valid");
    } else {
        capital.classList.remove("valid");
        capital.classList.add("invalid");
    }

    // Validate numbers
    var numbers = /[0-9]/g;
    if(myInput.value.match(numbers)) {  
        number.classList.remove("invalid");
        number.classList.add("valid");
    } else {
        number.classList.remove("valid");
        number.classList.add("invalid");
    }
      
      // Validate length
    if(myInput.value.length >= 8) {
        length.classList.remove("invalid");
        length.classList.add("valid");
    } else {
        length.classList.remove("valid");
        length.classList.add("invalid");
      }
    }
}
function passCheck()
{
        var x = document.getElementById("uname").value;
        if (x.value == " ")
        {
            window.alert("Please enter a valid e-mail address.");
            email.focus();
            return false;
        }

        else if (x.value.indexOf("@", 0) < 0)
        {
            window.alert("Please enter a valid e-mail address.");
            email.focus();
            return false;
        }

        else if (x.value.indexOf(".", 0) < 0)
        {
            window.alert("Please enter a valid e-mail address.");
            email.focus();
            return false;
        }            
}
function doctorType() 
{
    var x = document.getElementById("doctor-type").value;
    if(x=="Dentist")
    {
        //document.getElementById("demo").innerHTML = "You selected: " + x;
        if (window.XMLHttpRequest)
        {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp=new XMLHttpRequest();
        }
        else
        {// code for IE6, IE5
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.open("GET","dentist.xml",false);
        xmlhttp.send();
        xmlDoc=xmlhttp.responseXML; 

        document.write("<table>");
        var x=xmlDoc.getElementsByTagName("DT");
        for (i=0;i<x.length;i++)
        { 
            document.write("<tr><td>");
            document.write(x[i].getElementsByTagName("name")[0].childNodes[0].nodeValue);
            document.write("</td></tr></b><tr><td>");
            document.write(x[i].getElementsByTagName("dentist-name")[0].childNodes[0].nodeValue);
            document.write("</td><td>");
            document.write(x[i].getElementsByTagName("contact")[0].childNodes[0].nodeValue);  
            document.write("</td></tr><tr><td>");
            document.write(x[i].getElementsByTagName("addr")[0].childNodes[0].nodeValue);  
            document.write("</td><td>");
            document.write(x[i].getElementsByTagName("open-time")[0].childNodes[0].nodeValue); 
            document.write("</td></tr>");    
        }
        document.write("</table>");
    }    
}
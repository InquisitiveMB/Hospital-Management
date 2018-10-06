package org.j2eedev.math;

import org.j2eedev.calc.Login;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import java.io.*;
public class LoginTest extends TestCase {

	public String email;
	public String pwd;
	public String fname;
	public String lname;

	public LoginTest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		email ="roshani@gmail.com";
		pwd = "Pass@1234";
		fname="Roshani";
		lname="Aher";
				
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		email = "";
		pwd = "";
		fname ="";
		lname= "";
	}
	@Test
	public void testCon() {		//Database Connection Testing
		String total = "p_Successf_Successl_Success";
		String sum = Login.valid(email, pwd, fname, lname);
		assertEquals(sum, total);
	}
	@Before
	public void testWrongPass() {		//Password Testing
		String total = "p_unsuccessf_Successl_Success";
		String sum = Login.valid(email, "wrong", fname, lname);
		assertEquals(sum, total);
	}
	@Test
	public void testWrongfname() {		//First Name Testing
		String total = "p_Successf_unsuccessl_Success";
		String sum = Login.valid(email, pwd, "wrong", lname);
		assertEquals(sum, total);
	}
	@Test
	public void testWronglname() {		//Last Name Testing
		String total = "p_Successf_Successl_unsuccess";
		String sum = Login.valid(email, pwd, fname, "wrong");
		assertEquals(sum, total);
	}

}

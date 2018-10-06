package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement; 

public class SeleniumTesting {
	
	 public static String driverPath = "A:/";
	 public static WebDriver driver;
	 static String baseUrl ="A:/STQA/Medilab/index.html";
	 static String tagName = "";
		public static void main(String []args) throws InterruptedException
		{
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	        SeleniumTesting test = new SeleniumTesting();
	        
	       //Test cases
	        test.button_click();		//Tests that button is getting clicked or not
	        test.valid_email();			//Test that for valid info is next page is generating.
	        test.invalid_email();		//Test for invalid email
	        test.valid_password_length();	//Test for small passwords
	        test.valid_name();			//Test correct username
	        test.valid_number_appointment();//Test number length
		}
		
		public void button_click() throws InterruptedException
		{
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
			Thread.sleep(5000);
			System.out.println("Test 1: Button is getting Clicked.");
			Thread.sleep(5000);
			driver.close();
		}
		public void valid_email() throws InterruptedException
		{			
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("login_email")).sendKeys("a@gmail.com");
			driver.findElement(By.id("login_pass")).sendKeys("Pass12345");
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			Thread.sleep(5000);
			driver.findElement(By.id("submit_btn")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
			System.out.println("Test 2: Test for valid info next page is generating.");
			Thread.sleep(7000);
			driver.close();
		}
		public void invalid_email() throws InterruptedException
		{			
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("login_email")).sendKeys("a.com");
			driver.findElement(By.id("login_pass")).sendKeys("Pass12345");
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.findElement(By.id("submit_btn")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
			System.out.println("Test 3: Invalid email tested.");
			Thread.sleep(7000);
			driver.close();
		}
		
		public void valid_password_length() throws InterruptedException
		{			
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("login_email")).sendKeys("email@gmail.com");
			driver.findElement(By.id("login_pass")).sendKeys("12345");
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.findElement(By.id("submit_btn")).click();
			//WebDriverWait wait1 = new WebDriverWait(driver, 100);
			System.out.println("Test 4: Invalid password tested.(length)");
			Thread.sleep(7000);
			driver.close();
		}
		
		public void valid_name() throws InterruptedException
		{
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"register_link\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("register_name")).sendKeys("12345");
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.findElement(By.id("register_btn")).click();
			
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
			System.out.println("Test 5:Invalid name tested.");
			Thread.sleep(7000);
			driver.close();
		}		
		
		public void valid_number()
		{
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
		
			driver.findElement(By.id("register_btn")).click();
			driver.findElement(By.id("number")).sendKeys("");
			 
			driver.findElement(By.id("name")).sendKeys("name");
			driver.findElement(By.id("uname")).sendKeys("username");
					
			driver.findElement(By.id("submit_btn")).click();
		}
		public void valid_number_appointment() throws InterruptedException
		{
			driver = new ChromeDriver();
			driver.navigate().to(baseUrl);
			driver.get(baseUrl);
			driver.findElement(By.id("appointmentbtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("login_email")).sendKeys("a@gmail.com");
			driver.findElement(By.id("login_pass")).sendKeys("Pass12345");
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.findElement(By.id("submit_btn")).click();
			
			
			driver.findElement(By.id("firstName")).sendKeys("Roshani");
			driver.findElement(By.id("lastName")).sendKeys("Roshani");
			driver.findElement(By.id("age")).sendKeys("21");
			
			driver.findElement(By.id("number")).sendKeys("987654");
			
			driver.findElement(By.id("birthDate")).sendKeys("16071997");			
			driver.findElement(By.id("address1")).sendKeys("Baya Karve Hostel");
			driver.findElement(By.id("address2")).sendKeys("Tidke nagar");
			driver.findElement(By.id("city")).sendKeys("Pune");
			driver.findElement(By.id("region")).sendKeys("Karvenagar");
			driver.findElement(By.id("postalCode")).sendKeys("411052");
			
			Thread.sleep(5000);
			driver.findElement(By.id("submit_app")).click();
			
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
			System.out.println("Test 6: Valid Mobile number is Tested.");
			Thread.sleep(7000);
			driver.close();
		}
}
		
//		public void valid_password_UpperCase()
//		{
//			driver.findElement(By.id("uname")).sendKeys("email@gmail.com");
//			 
//			driver.findElement(By.id("pass")).sendKeys("abc12345678");
//			 
//			driver.findElement(By.id("submit_btn")).click();
//		}
//		
//		public void valid_password_LowerCase()
//		{
//			driver.findElement(By.id("uname")).sendKeys("email@gmail.com");
//			 
//			driver.findElement(By.id("pass")).sendKeys("ABC12345678");
//			 
//			driver.findElement(By.id("submit_btn")).click();
//		}
		

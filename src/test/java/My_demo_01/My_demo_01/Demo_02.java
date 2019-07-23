package My_demo_01.My_demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_02 {
	 WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String n, String s) {
		    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(n);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
			driver.findElement(By.xpath("//input[@name='Login']")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
		  Thread.sleep(5000);
	  }


	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	    	  new Object[] { "Shenthan123", "abcd1234" },
	          new Object[] { "Niranjan721", "abcd1234" },
	          new Object[] { "asif996", "abcd1234" },
	          new Object[] { "Anudeep", "abcd1234" },
	    };
	  }
	  @BeforeClass
	  public void beforeClass() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
			driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	}

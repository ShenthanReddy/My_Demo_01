package My_demo_01.My_demo_01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Banking {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		driver.manage().window().maximize();
		String k=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='/htdocs/nri_banking/accounts/fixed_deposits/fixed_deposits.htm']")).click();
		Set<String> T_windows = driver.getWindowHandles();
		for (String s : T_windows)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getWindowHandle());
		}
		driver.findElement(By.xpath("//img[@src='/htdocs/nri_banking/product_page/images/primnav/loans.gif']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'Attractive interest rates')]")).getText(), "Attractive interest rates");
		
	driver.close();
	driver.switchTo().window(k);
	driver.quit();
  }
}

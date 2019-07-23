package My_demo_01.My_demo_01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_02 {
	  WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		String Win_Name1 =driver.getWindowHandle();
		System.out.println(Win_Name1);
		driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
		Thread.sleep(5000);
		Set<String> T_windows = driver.getWindowHandles();
		int Cnt_windows = T_windows.size();
		System.out.println( Cnt_windows);
		for (String s : T_windows)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getWindowHandle());
		}
		driver.findElement(By.linkText("Apply Now")).click();
  }
}

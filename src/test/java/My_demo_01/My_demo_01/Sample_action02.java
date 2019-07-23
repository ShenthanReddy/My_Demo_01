package My_demo_01.My_demo_01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample_action02 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
			driver.manage().window().maximize();
			WebElement El1 = driver.findElement(By.xpath("//span[text()='AboutUs']"));
			WebElement El2 = driver.findElement(By.xpath("//span[text()='Our\n" + 
					"												Offices']"));
			Actions act1 =new Actions(driver);
			act1.moveToElement(El1).build().perform();
			act1.moveToElement(El2).build().perform();
			driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
			Set<String> T_windows = driver.getWindowHandles();
			for (String s : T_windows)
			{
				driver.switchTo().window(s);
			}
			driver.switchTo().frame(driver.findElement(By.name("main_page")));
			System.out.println(driver.findElement(By.xpath("//div[@class='contact-info']")).getText());
			driver.close();
  }
}

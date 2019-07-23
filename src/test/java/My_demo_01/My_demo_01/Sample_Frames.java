package My_demo_01.My_demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_Frames {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String s= driver.switchTo().alert().getText();
	  System.out.println(s);
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	  System.out.println(driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText());
	  driver.close();
	  
  }
}

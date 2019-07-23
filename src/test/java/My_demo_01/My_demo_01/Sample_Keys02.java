package My_demo_01.My_demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class Sample_Keys02 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement El1 = driver.findElement(By.xpath("//input[@name='q']"));
		El1.sendKeys("computer");
		Thread.sleep(10000);
		Actions act1 =new Actions(driver);
		act1.keyDown(El1,Keys.SHIFT).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
		String s = driver.findElement(By.xpath("//strong[text()='Build your own expensive computer']")).getText();
		 Assert.assertEquals(s,"BUILD YOUR OWN EXPENSIVE COMPUTER");
		 driver.close();
//		 SoftAssert asrt1 = new SoftAssert();
//		 String s1 = "LKM";
//		 String s2 = "AKMnghmghg";
//		 asrt1.assertEquals(s1, s2);
//		 System.out.println("output");
  }
}

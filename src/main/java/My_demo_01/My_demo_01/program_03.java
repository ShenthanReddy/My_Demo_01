package My_demo_01.My_demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_03 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Shenthan123");
		driver.findElement(By.cssSelector("input#password")).sendKeys("abcd1234");

}
}
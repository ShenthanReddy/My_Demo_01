package My_demo_01.My_demo_01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Mul_drivers {
	WebDriver driver;
  @Test
  public void a() {
	  driver = MyDriver123.getDriver("chrome");  
	  driver.get("http://10.232.237.143:443/TestMeApp");
  }
  @Test
  public void b() {
	  driver = MyDriver123.getDriver("ie");  
	  driver.get("http://10.232.237.143:443/TestMeApp");
  }

}

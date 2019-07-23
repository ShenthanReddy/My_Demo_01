package My_demo_01.My_demo_01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data_provider {
  @Test (priority =1)
  public void createWorkbook() throws IOException {
	  XSSFWorkbook workbook =new XSSFWorkbook();
	  FileOutputStream out = new FileOutputStream( new File("C:\\Users\\training_d2.03.07\\Desktop\\Test_Demo.xlsx"));
	  workbook.write(out);
	  out.close();
	  workbook.close();
  }
}

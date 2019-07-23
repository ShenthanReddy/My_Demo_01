package My_demo_01.My_demo_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write_Data {
	 @Test
	  public void WriteExcelDemo() throws IOException {
		  File src = new File("C:\\Users\\training_d2.03.07\\Desktop\\Test_Demo.xlsx");
		  FileInputStream fis = new FileInputStream(src);
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sheet1 = wb.getSheetAt(0);
		  int rowCount = sheet1.getLastRowNum();
		  System.out.println("Total no of rows is :"+rowCount);
		  for(int i=0;i<=rowCount;i++)
		  {
			  String Data = sheet1.getRow(i).getCell(0).getStringCellValue();
			  System.out.println("Test Data from excel sheet is :" +Data);
			  String Data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			  System.out.println("Test Data from excel sheet is :" +Data1);  
		  
		  }
		  sheet1.getRow(0).createCell(2).setCellValue("Result");
		  sheet1.getRow(1).createCell(2).setCellValue("Valid_User");
		  sheet1.getRow(2).createCell(2).setCellValue("Valid_User");
		  FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\training_d2.03.07\\Desktop\\Test_Demo.xlsx"));
		  wb.write(fout);
		  fout.close();
wb.close();
		  
		  
	  }
}

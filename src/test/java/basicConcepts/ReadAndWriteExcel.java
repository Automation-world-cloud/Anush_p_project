package basicConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcel {
	public static void main(String[] args) throws Exception {
		File source=new File("C:\\Users\\anush\\Desktop\\prac.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		System.out.println(sheet1.getRow(0).getCell(2).getStringCellValue());
		sheet1.getRow(0).createCell(5).setCellValue("city");
		FileOutputStream fos=new FileOutputStream(source);
		wb.write(fos);
	}

}

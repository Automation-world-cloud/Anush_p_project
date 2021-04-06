package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	
		public int getRowNum(String xlpath,String sheetname) throws IOException
		{
			 fis=new FileInputStream(xlpath);
			 wb=new XSSFWorkbook(fis);
			 wsh = wb.getSheet(sheetname);
			int rows = wsh.getLastRowNum();
			wb.close();
			fis.close();
			return rows;
		}
		public int getColNum(String xlpath,String sheetname,int rownum) throws IOException
		{
			fis=new FileInputStream(xlpath);
			 wb=new XSSFWorkbook(fis);
			 wsh = wb.getSheet(sheetname);
			 int cells = wsh.getRow(rownum).getLastCellNum();
			 return cells;
			
		}
		public String getData(String xlpath,String sheetname,int rownum,int cellnum) throws Exception 
		{
			fis=new FileInputStream(xlpath);
			 wb=new XSSFWorkbook(fis);
			 wsh = wb.getSheet(sheetname);
			 String data = wsh.getRow(rownum).getCell(cellnum).getStringCellValue();
			return data;
		}
	}



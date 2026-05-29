package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	
	String path;
	
//	public static void main(String[] args) throws Exception {
//		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\TestData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rowCount = sheet.getLastRowNum();
//		int colCount = sheet.getRow(0).getLastCellNum();
//		for(int i=0;i<rowCount;i++) {
//			XSSFRow curRow = sheet.getRow(i);
//			for(int j=0;j<colCount;j++) {
//				System.out.println(curRow.getCell(colCount).toString());
//			}
//		}
//		
//	}

	public ExcelUtilities(String path) {
		this.path = path;
	}
	public int getRowCount(String sheetName) throws Exception {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	
	}
	
	public int getCellCount(String sheetName,int rowNum) throws Exception {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		return cellCount;
	}
	
	public String getCellData(String sheetName,int rowNum, int colNum) throws Exception {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		String data;
		try {
			data = cell.toString();
		}catch (Exception e) {
			data = "";
		}
		return data;
	}
	
	
}

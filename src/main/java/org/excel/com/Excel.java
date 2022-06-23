package org.excel.com;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
private XSSFSheet ws;
	
	public void readExcel(int sheetNo) throws Exception {
		XSSFWorkbook wb = null;
		try {
			FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\Excel\\testData.xlsx");
			wb = new XSSFWorkbook(fis);
			ws = wb.getSheetAt(sheetNo);		
		} catch (Exception e) {
			System.out.println("In "+ new Object() {}.getClass().getEnclosingMethod().getName() +" Method");
			System.out.println(e);
		}finally {
			wb.close();
		}
	}
	
	public String getData(int row,int col) {
		if(ws!=null)
			return String.valueOf(ws.getRow(row).getCell(col));
		return "Please call readExcel Method First";
	}
	
	public int countData() {
		if(ws!=null)
			return ws.getPhysicalNumberOfRows();
		return 0;
	}
	
//	public static void main(String[] args) throws Exception {
//		Excel.readExcel("test.xlsx", 0);
//		System.out.println(Excel.countData());
//		System.out.println(Excel.getData(1, 0));
//	}
}

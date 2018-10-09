package DataUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import globals.Constants;



public class ExcelLib 
 {	
	String excelPath = "D://workspace//Spencers4//TestData//SpencTestData.xlsx";
	//String excelPath = "/data/EMBITEL/emb-rajarat/SeleniumRealProject/TestData/RegisterTestData.xlsx";
	public String getExcelData(String sheetName , int rowNum , int celNum) throws InvalidFormatException, IOException{
       FileInputStream fis = new FileInputStream(excelPath);
       Workbook wb = WorkbookFactory.create(fis);
       Sheet sh = wb.getSheet(sheetName);
       Row row = sh.getRow(rowNum);
       String data = row.getCell(celNum).getStringCellValue();          
       return data;
       
 }

 public int getRowCount(String sheetName) throws InvalidFormatException, IOException{
       FileInputStream fis = new FileInputStream(excelPath);
       Workbook wb = WorkbookFactory.create(fis);
       Sheet sh = wb.getSheet(sheetName);
       int rowCount = sh.getLastRowNum();

       return rowCount;
 }

 public void setExcelData(String sheetName,int rowNum,int celNum,String data) throws InvalidFormatException, IOException{
      FileInputStream fis = new FileInputStream(excelPath);
      Workbook wb = WorkbookFactory.create(fis);
      Sheet sh = wb.getSheet(sheetName);
      Row row = sh.getRow(rowNum);
      Cell cel = row.createCell(celNum);
      cel.setCellType(Cell.CELL_TYPE_STRING);
      cel.setCellValue(data);
      FileOutputStream fos = new FileOutputStream(excelPath);
      wb.write(fos);
      fos.close();
      fis.close();
    
 }
}


			



	

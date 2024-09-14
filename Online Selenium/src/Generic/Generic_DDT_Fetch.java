package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_DDT_Fetch {
static String value="";
static String value1="";
static String path ="C:\\Users\\amrit\\git\\RailEurope\\Online Selenium\\excel\\Office_Automation_2.xlsx";
public static String Origin_Fetch(String sheet, int row, int cell1)
{
	try 
	{
		FileInputStream fis = new FileInputStream(path);
	     Workbook book = WorkbookFactory.create(fis);
	     Sheet sh = book.getSheet(sheet); 
	     //Sheet sheet1= book.createSheet("Sandbox_Results");
	         Row r1 = sh.getRow(row);            
	         Cell origin = r1.getCell(cell1);  
	        value=origin.toString();
	        
	       // Cell destination = r1.getCell(cell2);  
	      //  value1=destination.toString();
	         
	         //String destination = r1.getCell(cell2).toString();				
	        // String dept_date = r1.getCell(3).toString();
	        
	} 
	
	catch (Exception e) 
	{
		 e.printStackTrace();
	}
	return value;
	// return value1;
	//return destination;
}
public static String Destination_Fetch(String sheet, int row, int cell2)
{
	try 
	{
		FileInputStream fis = new FileInputStream(path);
	     Workbook book = WorkbookFactory.create(fis);
	     Sheet sh = book.getSheet(sheet); 
	     //Sheet sheet1= book.createSheet("Sandbox_Results");
	         Row r1 = sh.getRow(row);            
	      //   Cell origin = r1.getCell(cell1);  
	      //  value=origin.toString();
	        
	        Cell destination = r1.getCell(cell2);  
	        value1=destination.toString();
	         
	         //String destination = r1.getCell(cell2).toString();				
	        // String dept_date = r1.getCell(3).toString();
	} 
	
	catch (Exception e) 
	{
		 e.printStackTrace();
	}
	return value1;
	// return value1;
	//return destination;
}
}

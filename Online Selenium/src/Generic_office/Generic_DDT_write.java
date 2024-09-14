package Generic_office;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_DDT_write 
{
public static void write(int row, int cell, String ref)
{
	Workbook book;
	FileInputStream fis;
	String path ="./excel/NR_B2B.xlsx";
	{
		try 
		{
		 fis = new FileInputStream(path);
	     book = WorkbookFactory.create(fis);
		     Sheet sh = book.getSheet("Sheet1");                                                //when to print in the same tab
		     Cell r2 = sh.getRow(row).getCell(cell);
		     
		  //   Cell r2 = sh.createRow(row).getCell(cell);
	      r2.setCellValue(ref);
		    
	            //Sheet sheet1= book.createSheet("Sandbox_Results");
               // Row r2 = sheet1.createRow(row);                                                // Write Fare name and price to Excel
                //Cell cl = r2.createCell(cell);
	           // cl.setCellValue(Train_Name+" - "+FareName+" - " +prices);
        
                                                                                                  //Write changes to the Excel file
             FileOutputStream fos = new FileOutputStream(path);
             book.write(fos);		         
		} 
		
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	
	}
}
}
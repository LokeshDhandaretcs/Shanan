package Parameterisation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class_A {
	
	public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("\"C:\\Users\\HP\\OneDrive\\Desktop\\Parameterization.xlsx\"");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(data);
	}



}

package dataProviderPracticeClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;


public class ExcelPractice {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:/Users/Nikunj/Desktop/Last Hishab.xlsx");
		Workbook wb = new Workbook(fis);
		Workbook wb1 = WorkBookFactory.
		
	}

}

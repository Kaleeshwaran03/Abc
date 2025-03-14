package FileOperator;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Calc {

	public static void main(String[] args) throws IOException {
	String [] Abb = {"ab", "bbb", "cc", "dd", "ee"};
		FileOutputStream f = new FileOutputStream("Pract.xlsx");
		XSSFWorkbook book = new XSSFWorkbook("/home/kaleesh/Documents/Important Coding Files/Excels");
		
		Sheet sheet = book.createSheet("NewExcel");
		
		for(int i=0; i< Abb.length; i++) {
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(Abb[i]);		
		}
		
		
		book.write(f);
		book.close();
		
		System.out.println("Success");

	}

}

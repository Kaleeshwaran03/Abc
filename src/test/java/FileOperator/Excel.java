package FileOperator;

import java.io.File;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import java.io.FileInputStream;




public class Excel {
	

	public static void main(String[] args) throws InterruptedException, Exception {
		File f = new File("/home/kaleesh/Documents/Important Coding Files/eclipse-workspace/MavenProject/target/Practice.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		try (HSSFWorkbook book = new HSSFWorkbook(f1)) {
			HSSFSheet sheet = book.createSheet("practice");
			HSSFRow row = sheet.createRow(0);
			HSSFCell cell = row.createCell(0);
			cell.setCellValue("Kaleesh");
		}
		Thread.sleep(3000);
		
			
		System.out.println("File printrd successfully");					
	}
}

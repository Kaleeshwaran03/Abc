package FileOperator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sample Sheet");

		// Create a row and put some cells in it
		Row row = sheet.createRow(0);
		Cell cell1 = row.createCell(0);
		cell1.setCellValue("Hello");

		Cell cell2 = row.createCell(1);
		cell2.setCellValue(123);

		// Write the output to a file
		try (FileOutputStream fileOut = new FileOutputStream("/home/kaleesh/Documents/Important Coding Files/Excels/file.xlsx")) {
			workbook.write(fileOut);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

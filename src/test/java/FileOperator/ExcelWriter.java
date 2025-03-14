package FileOperator;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

import java.io.IOException;


public class ExcelWriter {

    public static void main(String[] args) {

        // Names to be added to the Excel file

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};


        // Create a Workbook

        Workbook workbook = new XSSFWorkbook();

        // Create a Sheet

        Sheet sheet = workbook.createSheet("Names");


        // Create a Row and add names to it

        for (int i = 0; i < names.length; i++) {

            Row row = sheet.createRow(i);

            Cell cell = row.createCell(0);

            cell.setCellValue(names[i]);

        }


        // Write the output to a file

        try (FileOutputStream fileOut = new FileOutputStream("names.xlsx")) {

            workbook.write(fileOut);

            System.out.println("Excel file created successfully!");

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




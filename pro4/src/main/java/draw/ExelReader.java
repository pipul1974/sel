package draw;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReader {
	static Sheet sheet;
	public static Object[][] excelTo2DArray(String file, String sheetname) throws IOException {
		Object[][] t;
		
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);

		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();

		t = new Object[totalRows - 1][totalCols];
		for (int row = 1; row < totalRows; row++) {
			for (int col = 0; col < totalCols; col++) {
				t[row - 1][col] = getcellData(row, col);
			}
		}
		return t;
	}

	public static String getcellData(int row, int col) {
		Cell cell = sheet.getRow(row).getCell(col);
		String cellData = cell.getStringCellValue().trim();
		return cellData;

	}
	
	
	
	
	
	
}




package Methods;

import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class AppendLoginExcel {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/utilities/LoginData.xlsx";
        File file = new File(path);
        XSSFWorkbook workbook;
        XSSFSheet sheet;

        FileInputStream fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        fis.close();
        sheet = workbook.getSheet("LoginData");
        int lastRow = sheet.getLastRowNum();
        XSSFRow row = sheet.createRow(lastRow + 1);
        row.createCell(0).setCellValue("newUser");
        row.createCell(1).setCellValue("newPass@123");
        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("New data added at the end");
    }
}

package Methods;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class LoginDataWriteExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("src/test/java/utilities/LoginData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("LoginData");
        XSSFRow row1=sheet.createRow(0);
            row1.createCell(0).setCellValue("username");
            row1.createCell(1).setCellValue("passsword");
        XSSFRow row2 =sheet.createRow(1);
            row2.createCell(0).setCellValue("yashwanth");
            row2.createCell(1).setCellValue("yash@123");
        XSSFRow row3= sheet.createRow(2);
            row3.createCell(0).setCellValue("Abcdef");
            row3.createCell(1).setCellValue("Abc@123");
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("file created .....");

    }
}

package Methods;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FakerWriteExcel {
    public static void main(String[] args) throws IOException {
        Faker faker = new Faker();

        FileOutputStream file = new FileOutputStream("src/test/resources/TestData/FakerData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Fake");

        XSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("username");
        headerRow.createCell(1).setCellValue("password");

        for (int i = 1; i <= 5; i++) {
            XSSFRow row = sheet.createRow(i);

            String username = faker.name().username();
            String password = faker.internet().password(8,12,true,true,true);

            row.createCell(0).setCellValue(username);
            row.createCell(1).setCellValue(password);
        }

        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("file created successfully....");

    }
}

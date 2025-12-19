package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class AddEmpExcelUtils {

    public static List<Map<String, String>> getExcelData(String filePath, String sheetName) {
        List<Map<String, String>> dataList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);
            DataFormatter formatter = new DataFormatter();
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row currentRow = sheet.getRow(i);
                Map<String, String> dataMap = new HashMap<>();
                for (int j = 0; j < headerRow.getLastCellNum(); j++) {
                    String key = headerRow.getCell(j).getStringCellValue();
                    Cell cell = currentRow.getCell(j);
                    String value = "";
                    if (cell == null) {
                        value = "";
                    }
                    else if (cell.getCellType() == CellType.NUMERIC
                            && DateUtil.isCellDateFormatted(cell)) {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                        value = sdf.format(cell.getDateCellValue());
                    }
                    else {
                        value = formatter.formatCellValue(cell);
                    }
                    dataMap.put(key, value);
                }
                dataList.add(dataMap);
            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataList;
    }
}

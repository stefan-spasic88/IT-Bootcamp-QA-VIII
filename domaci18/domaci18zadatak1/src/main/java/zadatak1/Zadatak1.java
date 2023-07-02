package zadatak1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Napraviti maven projekat. Dodati dependencies za apache poi i faker.
Rucno kreirati xlsx fajl koji sadrzii 15 brojeva (može int ili double svejedno) rasporedjenih u 3 reda po 5 (A1-A3, B1-B3…).
U ovom koraku rucno pisemo u excel ne kroz kod.
Kroz kod treba da procitate sve brojeve, nadjete prosek svako reda, a zatim te vrednosti upisemo u novi sheet u istoj excel tabeli.
Primer: 1 red: 1, 3, -5, 8, 22, prosek je 29/5, 2 red: 1, 1, 1, 1, 1, prosek je 5/5… Novi sheet će dakle da ima vrednosti A1 = 29/5, A2 = 5/5…

 */
public class Zadatak1 {
    public static void main(String[] args) {
        try {

            FileInputStream brojevi = new FileInputStream("listabrojeva.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(brojevi);
            XSSFSheet sheet = workbook.getSheetAt(0);

            XSSFSheet resultSheet = workbook.createSheet("Rezultati");

            for (Row row : sheet) {
                double sum = 0;
                int count = 0;

                for (Cell cell : row) {
                    sum = sum + cell.getNumericCellValue();
                    count++;
                }
                double average = sum / count;

                XSSFRow resultRow = resultSheet.createRow(row.getRowNum());
                XSSFCell resultCell = resultRow.createCell(0);
                resultCell.setCellValue(average);
            }

            brojevi.close();
            FileOutputStream brojevi1 = new FileOutputStream("listabrojeva.xlsx");
            workbook.write(brojevi1);
            workbook.close();
            brojevi1.close();

            System.out.println("Proseci su uspesno izracunati i upisani u novi list");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

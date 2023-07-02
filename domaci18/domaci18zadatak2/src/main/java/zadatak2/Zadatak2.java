package zadatak2;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
Napraviti novi maven projekat. Dodati dependencies za apache poi i faker , Rucno kreirati xlsx fajl koji sadrzii 5 imena.
U ovom koraku rucno pisemo u excel ne kroz kod.
Kroz kod treba da procitamo, stavimo u niz i ispisemo tih 5 imena, a zatim dodati jos 5 imena koristeci Faker u isti niz.
Nakon toga potrebno je sva imena iz liste upisati u novi sheet u istoj excel tabeli.
Primer: Pocetan izgled excel sheet-a: Bilja, Milos, Marko, Ivana, Vladimir.
Izgled novog sheet-a: Bilja, Milos, Marko, Ivana, Vladimir (vrednosti iz prvog sheet-a), Suzana, Marina, Ivan, Aleksandar, Dusan (imena kreirana uz pomoc Faker-a).
 */
public class Zadatak2 {
    public static void main(String[] args) {

        try {

            FileInputStream imena = new FileInputStream("imena.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(imena);
            XSSFSheet sheet = workbook.getSheetAt(0);

            XSSFSheet novaImena = workbook.createSheet("Nova Imena");

            ArrayList<String> ime = new ArrayList<>();

            XSSFRow row = sheet.getRow(0);
            for (int i = 0; i < 5; i++) {
                XSSFCell cell = row.getCell(i);
                ime.add(cell.getStringCellValue());
            }
            imena.close();

            Faker faker = new Faker();
            for (int i = 0; i < 5; i++) {
                String ime1 = faker.name().firstName();
                ime.add(ime1);
            }

            XSSFRow row1 = novaImena.createRow(0);
            for (int i = 0; i < 10; i++) {
                XSSFCell cell = row1.createCell(i);
                cell.setCellValue(ime.get(i));
            }

            FileOutputStream imena1 = new FileOutputStream("imena.xlsx");
            workbook.write(imena1);
            workbook.close();
            imena1.close();

            System.out.println("Imena su uspesno upisana");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

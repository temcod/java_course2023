package lr10.Example3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //открываем файл Excel для чтения
        String filePath = "src/lr10/Example3.xlsx/";
        FileInputStream inputStream = new FileInputStream(filePath);

        //создаем экземпляр книги excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        //перебираем строки и ячейки листа
        for(Row row : sheet){
            for(Cell cell : row){
                //выводим значение ячейки на экран
                System.out.println(cell.toString()+ "\t");
            }
            System.out.println();
        }
        //закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();

    }
}

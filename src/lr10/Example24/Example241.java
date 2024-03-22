package lr10.Example24;
//2.4 Выполните следующую доработки проекта Excel парсера
// Улучшение работы с ошибками. Программы, которые читают Excel файлы, могут столкнуться с ошибками,
// такими как неправильный формат файла, отсутствие запрашиваемого листа и т.д.
// Улучшение работы с ошибками может включать более подробные сообщения об ошибках,
// рекомендации для исправления ошибок и возможность повторного запуска программы после исправления ошибок.
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Example241 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("src/lr10/Example3.xlsx/"));

            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода");
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

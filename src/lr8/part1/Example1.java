package lr8.part1;
import java.io.File;
public class Example1 {
    public static void main(String[] args) {
        try{
            File f1=new File("MyFile1.txt");

            f1.createNewFile();
            if (f1.exists()) {

                System.out.println("Создан!!!!");
                System.out.println("Полный путь1:	"+ f1.getAbsolutePath());
            }
            File f2=new File("/Users/alexander/Desktop/MyFile2.txt.txt"); f2.createNewFile();
            System.out.println( "Полный путь 2:	"+ f2.getAbsolutePath());

            File	f3=new File("/Users/alexander/Desktop/Papka1/Papka2/Papka3"); f3.mkdirs();
            System.out.println("Полный путь 3:	"+ f3.getAbsolutePath());
        } catch (Exception e) { System.out.println("Ошибка!!! "+e);
        }
    }
}


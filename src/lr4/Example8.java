package lr4;
import java.util.*;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String inputText = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        String encryptedText = Caesarcode.encrypt(inputText, key);

        System.out.println("Текст после преобразования :"  + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");

        boolean C = false;

        while (!C) {
            String reply = in.next();

            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caesarcode.decrypt(encryptedText, key);
                System.out.println(decryptStr);
                C= true;
            }

            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                C = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                C = false;
            }
        }
    } public static class Caesarcode {
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }
}
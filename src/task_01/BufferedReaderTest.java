package task_01;

import java.io.*;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Scanner;

public class BufferedReaderTest {
    public static void main(String[] args)  {

/*        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {}
            }
        }*/

        // try (выбросили исключение) -> catch (поймали исключение) -> finally (опционально)
        // try -> (не выбросили исключение) -> finally
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e); // мы не хотим чтобы программа продолжала своё выполнение
        }






/*        try {
            scannerTest();
            System.out.println("Код в блоке try после выброса исключения");
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Программа остановилась");
        }
        System.out.println("Код после try-catch");*/
    }

    public static void scannerTest() throws FileNotFoundException {
        File file = new File("test2.txt");
        Scanner sc = null;

        sc = new Scanner(file);

        int[] ints = new int[4];
        for (int i = 0; sc.hasNext(); i++) {
            ints[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(strings));
        for (int s : ints) {
            System.out.println(s);
        }
    }
}

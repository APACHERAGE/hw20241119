import java.io.*;
import java.util.HashSet;
import java.util.Set;
/*
2
Пусть дан файл, со списком имен, например так:

jack
john
ann
lena
Copy
ваша залача получить список уникальных (без повторов) имен из этого файла
 */

public class Main2 {
    public static void main(String[] args) {
        String inFile = "demo2.txt";
        String outFile = "demo3.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))
        ) {
            Set<String> specialNames = new HashSet<>();
            String line;


            while ((line = reader.readLine()) != null) {
                specialNames.add(line.trim());
            }


            for (String name : specialNames) {
                writer.write(name);
                writer.newLine();
            }

            System.out.println("Записано в  " + outFile);

        } catch (IOException e) {
            System.err.println("Произошла ошибка");
        }
    }
}

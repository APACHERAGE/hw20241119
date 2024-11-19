import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
3
Пусть дан файл, с информацией о Person

jack;32
john;21
ann,5
lena,17

т.е. имя и возраст. Ваша залача получить список Person
 */

public class Main3 {
    public static void main(String[] args) {
        String inFile = "demo4.txt";
        List<Person> personList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[;,]");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    personList.add(new Person(name, age));
                }
            }


            for (Person person : personList) {
                System.out.println(person);
            }

        } catch (IOException e) {
            System.err.println("Ошибка" );

        }
    }
}
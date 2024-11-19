import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
/*
1
Напишите программу, которая предлагает ввести пользователю его имя и возраст и записывает эту информацию в файл с названием name.txt
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        try (FileWriter writer = new FileWriter("name.txt")){
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age);
            System.out.println("Data is written to name.txt");
        } catch (IOException e) {
            System.err.println("Errror");
        }

        }

    }




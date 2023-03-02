package javaSyntaxZero.levelTwo.dataEntry;

import java.util.Scanner;

public class JavaRushDataEntryMain {
    public static void main(String[] args) {
        //ввод с клавиатуры
        Scanner console = new Scanner(System.in);  // объявлена переменная console типа Scanner (создан новый объект)
        // в качестве параметра нового объекта передается объект System.in из которого объект scanner будет брать данные
        System.out.println("Input name "); // вводим имя
        String name3 = console.nextLine(); // считываем с клавиатуры строку с использованием метода nextLine()
        System.out.println("Input age ");  // вводим зозраст
        int age = console.nextInt();       // считываем с клавиатуры целочисленную переменную методом nextInt()
        System.out.println("Input weight "); //водим вес
        double weight = console.nextDouble(); // вводим вес (дробное число) методом nextDouble()

        System.out.println("Name: " + name3); // выводим на печать
        System.out.println("Age: " + age);
        System.out.println("My weight: " + weight);
        System.out.println();

        //ввод данных из строки
        String str2 = "15 25 30 50"; // scanner может считывать из строки текст
        Scanner scanner = new Scanner(str2); //вместо объекта System.in в параметры передается строка str2
        int c = scanner.nextInt(); //считываются данные из строки с = 15
        int d = scanner.nextInt(); // d = 25
        int i = scanner.nextInt(); // i = 30
        System.out.println(c + d + i); // выводим на печать
    }
}

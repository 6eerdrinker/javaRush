package javaSyntaxZero.levelThree.logicalOperator;

import java.util.Scanner;

public class LogicalOperator {
    private static final String TRIANGLE_EXISTS = "Такой треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "Такой треугольник не  существует";

    public static void main(String[] args) {
//  задача 0306
//  Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
//  Для этого тебе нужно:
//  Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
//  Определить возможность существования треугольника по сторонам.
//  Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
//     Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
//     То есть, тебе нужно выполнить три сравнения:
//  Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
//  Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других,
//  то треугольника с такими сторонами не существует.
        System.out.println("Введите длину стороны треугольника A ");
        Scanner triangleA = new Scanner(System.in);
        int lengthA = triangleA.nextInt();
        System.out.println("Введите длину стороны треугольника B ");
        Scanner triangleB = new Scanner(System.in);
        int lengthB = triangleB.nextInt();
        System.out.println("Введите длину стороны треугольника C ");
        Scanner triangleC = new Scanner(System.in);
        int lengthC = triangleC.nextInt();
        if (lengthA < (lengthB + lengthC) &&   // В этом условии прописано три логических выражения!!!
                lengthB < (lengthA + lengthC) &&
                lengthC < (lengthA + lengthB)) {
            System.out.println(TRIANGLE_EXISTS);
        }else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }

        //задача 0307
        //Напишем программу, которая будет считывать с клавиатуры возраст.
        // Если возраст от 20 до 60 (включительно), то выводить ничего не нужно,
        // иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!)
        // с помощью только одного оператора if без else.
        //Подсказка: используй логический оператор "||" (или)
        System.out.println();
        System.out.println("Введите Ваш возраст ");
        Scanner diffWork = new Scanner(System.in);
        int age = diffWork.nextInt();
        if (age <20||age>60){  //в этом условии есть два логических выражения
        System.out.println("Можно не работать");}

        // Пример использования логических переменных вместо логических выражений

        System.out.println();
        int age1 = 35;
        if (age1 >= 18 && age1 <= 65) //  условие состоит из двух логических выражений
            System.out.println("Вы можете работать");

        System.out.println();
        int age2 = 66;
        boolean isYoung = (age2 < 18);
        boolean isOld = (age2 > 65);
        if (!isYoung && !isOld) // логические выражения заменены логическими переменными
            System.out.println("Вы можете работать");
    }
}

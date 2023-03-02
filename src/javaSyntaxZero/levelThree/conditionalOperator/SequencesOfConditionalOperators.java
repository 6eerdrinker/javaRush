package javaSyntaxZero.levelThree.conditionalOperator;

import java.util.Scanner;

public class SequencesOfConditionalOperators {
    public static void main(String[] args) {
        // Последовательность условных операторов
        //Допустим, задача звучит так:
        //Если температура выше 20 градусов — надеть рубашку
        //Если температура выше 10 градусов и меньше (или равна) 20 — надеть свитер
        //Если температура выше 0 градусов и меньше (или равна) 10 — надеть плащ
        //Если температура ниже 0 градусов — надеть пальто.
        int temp = 25;
        if (temp > 20) {
            System.out.println("Надеть рубашку");
        } else {  // тут температура менше или равна 20
            if (temp > 10) {
                System.out.println("Надеть свитер");
            } else { // тут температура меньше или равна 10
                if (temp > 0) {
                    System.out.println("Надеть плащ");
                } else {  // тут температура меньше или равна 0
                    if (temp < 0) {
                        System.out.println("Надеть пальто");
                    }
                }
            }
        }
        // можно без фигурных скобок
        int temp1 = -25;
        if (temp1 > 20)
            System.out.println("Надеть рубашку");
        else //тут температура меньше или равна 20
        if (temp1 >10)
            System.out.println("Надеть свитер");
        else //тут температура меньше или равна 10
            if (temp1 > 0)
                System.out.println("Надеть плащ");
            else //тут температура меньше или равна 0
        if (temp1<0)
            System.out.println("Надеть пальто");

        // красивее писать так
        int temp2 = 19;
        if (temp2 > 20)
            System.out.println("Надеть рубашку");
        else if (temp2 > 10) // тут температура менше или равна 20
            System.out.println("Надеть свитер");
        else if (temp2 > 0)  // тут температура менше или равна 10
            System.out.println("Надеть плащ");
        else if (temp2 < 0)  // тут температура менше или равна 0
            System.out.println("Надеть пальто");

        // Важный момент:
        // Если в конструкции if-else не расставлены фигурные скобки,
        // else относится к предыдущему (ближайшему к нему) if-у.
        int age = 21;
        if (age < 60)
            if (age > 20)
                System.out.println("Надо работать");
            else
                System.out.println("Можно не работать");

            // Задача Есть программа, которая принимает на вход возраст и определяет,
            // нужно в школу или уже пора в институт. Но она работает неправильно.
            // Например, пятилетнего ребенка отправляют в институт! Исправить программу
            // несложно: достаточно в нужном месте поставить фигурные скобки.

                Scanner scanner = new Scanner(System.in);
                int age3 = scanner.nextInt();
        if (age3 < 18){  // если возраст более 18 то тогда else
        if (age3 >= 6)   // если возраст менее 6 то тогда ни чего не выводится
                    System.out.println("нужно ходить в школу");
                } else
                        System.out.println("пора в институт");

    }}

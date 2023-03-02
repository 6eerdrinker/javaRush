package javaSyntaxZero.levelThree.conditionalOperator;

import java.util.Scanner;

public class ConditionalOperatorMain {
    public static void main(String[] args) {
        // условный оператор
        int age = 17;
        if (age < 18) {    // В этом условии прописано одно логическое выражение - если вам меньше 18
            System.out.println("Вы еще ребенок");  // вы ребенок
        } else {                    // иначе
            System.out.println("Вы уже взрослый"); // взрослый
        }

        // Задача 1. Ввести с клавиатуры температуру на улице.
        // Если температура меньше 0, вывести надпись "на улице холодно",
        // иначе - вывести надпись "на улице тепло".
        System.out.println();
        String warm = "На улице тепло";
        String cold = "На улице холодно";
        Scanner console = new Scanner(System.in);
        System.out.println("Укажите температуру на улице ");
        int temp = console.nextInt();
        if (temp < 0) {   //в этом условии прописано одно логическое выражение
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }

        // Задача 2 Ввести с клавиатуры имя и возраст. Если возраст в
        // пределах 18-28 (включительно), то вывести надпись
        // "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.
        System.out.println();
        String militaryCommissar = ", явитесь в военкомат";
        Scanner console1 = new Scanner(System.in);
        System.out.println("Укажите Ваше имя ");
        String name = console1.nextLine();
        System.out.println("Укажите Ваш возраст ");
        int age1 = console1.nextInt();
        if (age1 >= 18 && age1 <= 28) {  // в этом условии прописано два логических выражения
            System.out.println(name +  militaryCommissar);
        }

        //& один амперсанд используется для проверки обоих условий, т.е. если первое условие у Вас будет false,
        // то второе условие всё равно будет проверено и примет значение либо false,
        // либо true и этим можно как-либо воспользоваться. В общем
        // один амперсанд (&) используется, если необходимо, чтобы проверялись оба условия.
        //
        //&& два амперсанда проверяет первое условие, и если оно ложно (false), то проверка заканчивается,
        // без вычисления второго условия, что позволяет улучшить производительность при громоздких проверках.
        // В общем два амперсанта (&&) используются, если нам важно знать результат выражения проверки в целом,
        // без необходимости знать значения отдельных условий.


        // можно писать код в таком виде
        System.out.println();
        int age2 = 18;
        if (age2 == 18)
            System.out.println("явитесь в военкомат"); // команда выпоняется без фигурных скобок

    }
}
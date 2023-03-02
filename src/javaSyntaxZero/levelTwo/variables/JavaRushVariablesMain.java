package javaSyntaxZero.levelTwo.variables;

public class JavaRushVariablesMain {
    public static void main(String[] args) {
        //математические действия
        int x = 5 / 2; //выдает деление без остатка т.е. в итоге 2
        x++;  // инкремент - прибавляет еденицу к переменной т.е. в итоге 3
        x++;  // 4
        x++;  // 5
        System.out.println(x);
        System.out.println();

        int y = 5 % 2; //выдает остаток от деления целых чисел т.е. в итоге 1
        y--;  // декремент - вычитает еденицу от переменной т.е. в итоге 0
        y--;  // -1
        y--;  // -2
        System.out.println(y);
        System.out.println();

        // действия со строками
        int a = 5;    //со строками нельзя производить арифметические действия, можно сделать только конкатенацию
        String num = "1";
        System.out.println(a * a + num + a); // склеили (конкотенация) - итог - 2515
        System.out.println();

        String str = "" + 15;  // простое преобразование числа в строку с применением "пустой строки"
        System.out.println(str);
        System.out.println();

        String str1 = "123";   // преобразование строки в число с применением метода parseInt класса Integer
        int b = Integer.parseInt(str1 + 888); // итог 123888
        System.out.println(b);
        System.out.println();

        String sity = "Moscow";  // метод length позволяет узнать длину строки (количество символов)
        int count1 = sity.length(); // 6
        int count = (sity + 6).length(); //7
        System.out.println(count1);
        System.out.println(count);
        System.out.println();

        String name = "PeTe";  // использование методов изменения прописных и заглавных букв
        String name1 = name.toLowerCase(); // pete
        String name2 = name.toUpperCase();  // PETE
        System.out.println(name1);
        System.out.println(name2);
        System.out.println();

    }
}

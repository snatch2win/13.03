import java.util.Scanner;

public class calc {
    public static void main(String[] args)

            throws java.io.IOException {
        System.out.println("это калькулятор, вы можете производить вычислительные действия с числами");
        char de;
        double w1, w2, w3, w4;

        //for (; ;) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        double x = in.nextDouble();

        System.out.println("введите операзию ( / * - + )");
        de = (char) System.in.read();

        System.out.println("Введите число");
        double z = in.nextDouble();

        while (de == '/' || de == '*' || de == '-' || de == '+') {
            switch (de) {
                case '/':
                    w1 = x / z;
                    System.out.println("Результат операции деления равен: " + w1);
                    return;
                case '*':
                    w2 = x * z;
                    System.out.println("Результат операции умножения равен: " + w2);
                    return;
                case '-':
                    w3 = x - z;
                    System.out.println("Результат операции вечетания равен: " + w3);
                    return;
                case '+':
                    w4 = x + z;
                    System.out.println("Результат операции сложения равен: " + w4);
                    return;
                default:
                    System.out.println("!!!");
            }

        } if (true) {
                System.out.println("Операция " + de + " введена неправильно !!");
                System.out.println("Допускаются операции: ");
                System.out.println("Деления (/)");
                System.out.println("Умножения (*)");
                System.out.println("Вычитания (-)");
                System.out.println("Сложения (+)");
            }
        //}
    }
}

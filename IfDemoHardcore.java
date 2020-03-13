import java.util.Scanner;

public class IfDemoHardcore {
    public static void main(String[] args) {

        System.out.println("Эта программа сравнивает два числа.");
        Scanner in = new Scanner(System.in);

        for (; ;){
            System.out.println("введите число a");
            double one = in.nextDouble();
            System.out.println("введите число b");
            double two = in.nextDouble();

            if (one < two) {
                System.out.println(one + " < " + two );
            } else if (one > two) {
                System.out.println(one + " > " + two);
            } else if (one == two) {
                System.out.println(one + " = " + two);
            }
        }
    }
}

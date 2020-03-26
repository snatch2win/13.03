public class Example {
    public static void main(String[] args)

       throws java.io.IOException {
           char ch, answer = 's';

            System.out.println("Задумана буква из диа позона A - Z.");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read();

            if (ch == answer)
                System.out.println("** Правильно!! **");
            else {
                System.out.println("...Извините, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
            }
        }
}



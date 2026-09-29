import java.util.Scanner;

public class PRAK102_2510817120002_AmaliaSoraya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int count = 0;

        while (count < 10) {
            if(number % 5 == 0) {
                int x = (number / 5) - 1;
                System.out.print(x);
            } else {
                System.out.print(number);
            }

            if(count < 9) {
                System.out.print(", ");
            }
            number++;
            count++;
        }

        scanner.close();
    }
}
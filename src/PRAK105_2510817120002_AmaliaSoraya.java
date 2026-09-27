import java.util.Scanner;

public class PRAK105_2510817120002_AmaliaSoraya {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();

        final double PI = 3.1415;
        double volume = PI * radius * radius * height;

        System.out.print("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height + " cm adalah ");
        System.out.printf("%.3f", volume);
        System.out.print(" m3");

        scanner.close();
    }
}
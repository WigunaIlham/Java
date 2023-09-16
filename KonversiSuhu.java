import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis konversi suhu:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Suhu dalam Celsius: " + celsius);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}

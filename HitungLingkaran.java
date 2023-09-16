// Mengimpor kelas Scanner dari paket java.util
// Kelas Scanner digunakan untuk membaca input dari user melalui keyboard atau sumber input lainnya.
import java.util.Scanner;

public class HitungLingkaran {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Mengambil input jari-jari dari pengguna
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas lingkaran
        double luas = 3.14159 * jariJari * jariJari;

        // Menghitung keliling lingkaran
        double keliling = 2 * 3.14159 * jariJari;

        // Menampilkan hasil
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);

        // Menutup objek Scanner
        input.close();
    }
}

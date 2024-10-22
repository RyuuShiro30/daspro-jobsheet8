import java.util.Scanner;

public class Ratanilai08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + ": ");
                int nilai = scanner.nextInt();
                totalNilai += nilai;
            }

            double rataRata = (double) totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataRata);
        }

        scanner.close();
    }
}
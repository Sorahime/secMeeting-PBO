import java.util.Scanner;

public class THT2 {
    public static void main(String[] args) {
        
        System.out.println("Masukkan Nama: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.println("Masukkan Usia: ");
        int age = input.nextInt();
        
        System.out.println("Masukkan Jumlah Mata Kuliah yang Diambil: ");
        int jumlahMK = input.nextInt();
        
        double totalNilai = 0;
        
        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("Masukkan Nilai Mata Kuliah " + i + " (0-100): ");
            double nilai = input.nextDouble();
            totalNilai += nilai; //Pake Rekrusif yg sama seperti di C++
        }
        
        input.close();

        double rataRata = totalNilai / jumlahMK;
        double ipk = ( rataRata >= 85 ) ? 4.0 : 
                     ( rataRata >= 75 ) ? 3.5 : 
                     ( rataRata >= 65 ) ? 3.0 : 
                     ( rataRata >= 55 ) ? 2.5 :
                     ( rataRata >= 45 ) ? 2.0 : 1.5;


        boolean operatorAge = age > 22;
        boolean ipkTinggi = (ipk >= 3.5) && (jumlahMK > 4);
        boolean ipkRendah = (ipk < 2.5) || (jumlahMK < 4);
        int nomorAntrian = (int) (Math.random() * 100);
        

        System.out.println("\n=== LAPORAN AKADEMIK MAHASISWA ===");

        System.out.println("Nama               : " + name);
        System.out.println("NIM                : " + nim);
        System.out.println("Usia               : " + age + " tahun");
        System.out.println("Jumlah Mata Kuliah : " + jumlahMK);
        System.out.println("Rata-rata Nilai    : " + rataRata);
        System.out.println("IPK                : " + ipk);

        System.out.println("\nApakah mahasiswa berusia lebih dari 22 tahun? " + operatorAge);
        System.out.println("Apakah IPK >= 3.5 dan jumlah MK > 4? " + ipkTinggi);
        System.out.println("Apakah IPK < 2.5 atau jumlah MK < 4? " + ipkRendah);

        System.out.println("\nNomor Antrian Konsultasi Akademik: " + nomorAntrian);
    }
}

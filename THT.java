import java.util.Scanner;

public class THT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();
            
        System.out.print("Masukkan Nama Karyawan: ");
        String namE = input.nextLine();
            
        System.out.print("Pilih Shift Kerja (pagi/siang/malam): ");
        String shift = input.nextLine().toLowerCase();
            
        System.out.print("Masukkan total jam kerja dalam seminggu: ");
        int jamKerja = input.nextInt();
            
        System.out.print("Masukkan jumlah hari absen: ");
        int hariAbsen = input.nextInt();

        input.close();
            
        double tarifPerJam;
        switch (shift) {
            case "pagi":
                tarifPerJam = 30000;
                break;
            case "siang":
                tarifPerJam = 35000;
                break;
            case "malam":
                tarifPerJam = 40000;
                break;
            default:
                System.out.println("Shift tidak valid, menggunakan tarif default Rp0");
                tarifPerJam = 0;
            }
            
            double gajiNormal = jamKerja * tarifPerJam;
            double lembur = (jamKerja > 40) ? (jamKerja - 40) * (tarifPerJam * 1.5) : 0;
            double potongan = (jamKerja < 30) ? gajiNormal * 0.10 : 0;
            double potonganAbsen = hariAbsen * 100000;
            double totalGaji = gajiNormal + lembur - potongan - potonganAbsen;
            
            System.out.println("\n=== LAPORAN GAJI KARYAWAN ===");
            System.out.println("ID Karyawan       : " + idKaryawan);
            System.out.println("Nama Karyawan     : " + namE);
            System.out.println("Shift Kerja       : " + shift);
            System.out.println("Total Jam Kerja   : " + jamKerja + " jam");
            System.out.println("Total Lembur      : " + ((jamKerja > 40) ? (jamKerja - 40) + " jam" : "0 jam"));
            System.out.println("Jumlah Hari Absen : " + hariAbsen);
            System.out.println("Gaji Kotor        : Rp" + gajiNormal); //Gaji Sebelum Dipotong
            System.out.println("Bonus Lembur      : Rp" + lembur);
            System.out.println("Potongan Gaji     : Rp" + potongan); //Potongan Gaji karena Jam Kerja Kurang dari 30 Jam
            System.out.println("Potongan Absen    : Rp" + potonganAbsen);
            System.out.println("Total Gaji        : Rp" + totalGaji);
    }
            
}


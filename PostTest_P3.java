import java.util.Scanner;

public class PostTest_P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: Rp.  ");
        double totalBelanja = input.nextDouble();

        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/None): ");
        String tipeMember = input.next();


        double diskonUtama = 0;
        if (totalBelanja > 500000) {
            diskonUtama = 0.20;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 0.10;
        }

        double hargaSetelahDiskon = totalBelanja - (totalBelanja * diskonUtama);
        double diskonTambahan = 0;
        switch (tipeMember.toLowerCase()) {
            case "platinum":
                diskonTambahan = 0.05;
                break;
            case "gold":
                diskonTambahan = 0.03;
                break;
            case "silver":
                diskonTambahan = 0.02;
                break;
            case "none":
                diskonTambahan = 0;
                break;
            default:
                System.out.println("Error: Tipe member tidak valid.");
                return;
        }

        double hargaAkhir = hargaSetelahDiskon - (hargaSetelahDiskon * diskonTambahan);
        String pesanDiskon = (diskonUtama > 0 || diskonTambahan > 0) 
            ? "Anda mendapatkan diskon!" 
            : "Tidak ada diskon untuk pembelian ini.";

        System.out.println(pesanDiskon);
        System.out.printf("Total yang harus dibayar: Rp%,.2f\n", hargaAkhir);
    }
}

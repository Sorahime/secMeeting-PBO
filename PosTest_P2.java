import java.util.Scanner;

public class PosTest_P2 {
    public static void main(String[] args) throws Exception {
       
        System.out.println ("Masukkan nama : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
            
        System.out.println("Masukkan umur : ");
        int age = input.nextInt();
        
        System.out.println("Masukkan jumlah uang yang dimiliki : ");
        double jumlahUang = input.nextDouble();

        System.out.println("Masukkan rata-rata pengeluaran  : ");
        double jumlahPengeluaran = input.nextDouble();
        
        input.close();


        Double OperatorAgeDouble = (double)age;
        int OperatorMoneyInt = (int)jumlahUang;

        double estimasiUang = jumlahUang - (jumlahPengeluaran * 30);
        double estimasiBulan = jumlahUang / (jumlahPengeluaran * 30);

        double bulanKeBawah = Math.floor(estimasiBulan);
        
        String statusKeuangan = bulanKeBawah <= 1 ? "PERINGATAN : Keuangan Anda Kurang Stabil" : 
                                (bulanKeBawah > 6 ? "Kondisi Keuangan Anda Sangat Stabil" : "Keuangan Anda Stabil");
        

        boolean operatorPerbandingan = age > 30;
        System.out.println("\nApakah umur lebih dari 30 tahun? " + operatorPerbandingan);

        boolean operatorLogika1 = age > 30 && jumlahUang > 10_000_000;
        System.out.println("Apakah umur lebih dari 30 tahun dan jumlah uang lebih dari 10.000.000? " + operatorLogika1);

        boolean operatorLogika2 = age < 30 || jumlahUang > 5_000_000;
        System.out.println("Apakah umur kurang dari 30 tahun atau jumlah uang lebih dari 5.000.000? " + operatorLogika2);
        

        double nilaiAbsoluteHutang = Math.abs(estimasiUang);
        double pengeluaranKeAtas = Math.ceil(jumlahPengeluaran);
        double bonusTakTerduga = Math.random() * 1_000_000;
        double totalSetelahBonus = jumlahUang - pengeluaranKeAtas + bonusTakTerduga;

       
                System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
                System.out.println("Nama : " + name);
                System.out.println("Umur : " + age);
                System.out.println("Jumlah Uang yang dimiliki : Rp. " + jumlahUang);
                System.out.println("Rata-rata Pengeluaran Harian : Rp. " + jumlahPengeluaran);
                System.out.println("Sisa uang (30 hari) : Rp.  " + estimasiUang);
                System.out.println("Estimasi bulan bertahan : " + bulanKeBawah);
                System.out.println("\nStatus Keuangan :\n " + statusKeuangan);
                System.out.println("\nNilai Absolute Hutang : Rp.  " + nilaiAbsoluteHutang);
                System.out.println("Pengeluaran ke atas : Rp.  " + pengeluaranKeAtas);
                System.out.println("Bonus Tak Terduga : Rp. " + bonusTakTerduga);
                System.out.println("Total uang yang dimiliki setelah Pengeluaran dan Bonus : Rp.  " + totalSetelahBonus);

                System.out.println("\n=== TAMBAHAN LAPORAN PROGRAM ===");
                System.out.println("Konversi Usia (int) dalam Double : " + OperatorAgeDouble);
                System.out.println("Konversi Jumlah Uang (double) dalam Integer : Rp.  " + OperatorMoneyInt);   


    }
        
}
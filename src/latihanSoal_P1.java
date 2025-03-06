import java.util.Scanner;

public class latihanSoal_P1 {
    public static void main(String[] args) throws Exception {
        System.out.println ("Masukkan nama : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Masukkan umur Anda : ");
        int age = input.nextInt();
        System.out.println("Masukkan tinggi badan Anda : ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan");
        System.out.println("Nama Anda : " + name);
        System.out.println("Umur Anda : " + age);
        System.out.println("Tinggi badan Anda : " + height);

        input.close();

        int operatorAritmatika = (age * 2) + 10/ 5 - 3;
        System.out.println( "\nOperator Aritmatika : " + operatorAritmatika);

        boolean operatorPerbandingan = age > 18;
        System.out.println("\nApakah umur lebih dari 18 tahun? " + operatorPerbandingan);

        boolean operatorLogika = age > 18 && height > 160;
        System.out.println("\nApakah umur lebih dari 18 tahun dan tinggi badan lebih dari 160 cm? " + operatorLogika);

        Double ageDouble = (double)age;
        int heightInt = (int)height;

        System.out.println("\nKonversi Usia (int) dalam Double : " + ageDouble);
        System.out.println("\nKonversi Height (double) dalam Integer :" + heightInt);

    }
}
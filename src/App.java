import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur = 20;
        double ipk = 4.0;
        char inisial= 'S';
        String nama = "Sora";

        System.out.println("Nama : " + nama + "\nUmur : " + umur + "\nIPK : " + ipk + "\nInisial : " + inisial);

        byte nomorByte = -128;
        short nomorShort = -32768;
        long nomorLong = 100000000;
        float phi = 3.14f;

        System.out.println("\nByte : " + nomorByte + "\nShort : " + nomorShort + "\nLong : " + nomorLong + "\nFloat : " + phi);

        boolean isJavaFun = true;

        System.err.println(isJavaFun);

        char var1 = 65;
        System.out.println(var1);

        String firstName = "Abel";
        String lastName = "Kvokski";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

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

        

       
    }
}


class Kendaraan {
    Kendaraan () {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    Mobil(){
        super();
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class LatihanDua {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Mobil dibuat");
        System.out.println("Kendaraan dibuat");  
    }
}

class  Hewan {
    String suara = "Suara Hewan";

    Hewan(){
        System.out.println("Ini constructor Parent");
        System.out.println();
    }
}

class Kucing extends Hewan {
    String suara = "Meow";

    Kucing(){
        System.out.println("Ini constructor Child");
    }

    void tampilkanSuara() {
        System.out.println("Suara Kucing : " + suara);
        System.out.println("Suara Hewan  : " + super.suara);
        System.out.println();
    }
}

public class LatihanSatu {
    public static void main(String[] args) throws Exception {
        Kucing kucing = new Kucing();
        kucing.tampilkanSuara();
    }
}

import java.util.List;

public class ArrayList {
    public static void main(String[] args){
        List<String> NamaToko = new java.util.ArrayList<>();
        NamaToko.add("Hasil Bumi");
        NamaToko.add("Bersama");
        NamaToko.add("Rizki");
        NamaToko.add("Sarinah");
        NamaToko.add("Bening");


        List<String> LokasiToko = new java.util.ArrayList<>();
        LokasiToko.add("Debong");
        LokasiToko.add("Bandung Klimping");
        LokasiToko.add("Randugunting");
        LokasiToko.add("Limbangan");
        LokasiToko.add("Kemantran");
        LokasiToko.add("Jatibogor");


        System.out.println(LokasiToko.get(0));
        System.out.println(LokasiToko.get(1));
        System.out.println(LokasiToko.get(2));
        System.out.println(LokasiToko.get(3));
        System.out.println(LokasiToko.get(4));
        System.out.println(LokasiToko.get(5));
        //Mencetak Nilai dari Kedua Objek sesuai dengan Posisi Index Array
    }
}





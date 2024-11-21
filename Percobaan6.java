
import java.util.Scanner;

public class Percobaan6 {

    static int hitungLuas(int p, int l){
        int Luas=p*l;
        return Luas;        
    }
    static int hitungVolume(int t, int p, int l){
        int volume =hitungLuas(p,l)*t;
        return volume;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang :");
        p = cs.nextInt();
        System.out.print("Masukkan lebar :");
        l = cs.nextInt();
        System.out.print("Masukkan tinggi :");
        t = cs.nextInt();

        L=p*l;
        System.out.println("Luas persegi panjang :"+L);

        vol=p*l*t;
        System.out.println("Volume persegi panjang :"+vol);

        System.out.println("Luas persegi panjang Menggunakan fungsi :"+hitungLuas(p, L));
        System.out.println("Volume persegi panjang Menggunakan fungsi :"+hitungVolume(t,p,l));

    }
}


import java.util.Scanner;

public class Kubus03 {
    static int hitungVolume(int sisi){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int hitungLuas(int sisi){
        int luas = 6*sisi*sisi;
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();

        System.out.println("volume kubus: "+hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: "+hitungLuas(sisi));
    }
}

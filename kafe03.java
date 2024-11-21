
import java.util.Scanner;

public class kafe03{

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang, "+namaPelanggan+"!");
        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap bembelian");
        }

        if(kodePromo.equalsIgnoreCase("diskon50")){
            System.out.println("Anda mendapatkan diskon 50%");
        }else if(kodePromo.equalsIgnoreCase("diskon30")){
            System.out.println("Anda mendapatkan diskon 30%");
        }else{
            System.out.println("kode invalid");
        }
        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. kopi hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem={15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal=hargaItem[pilihanMenu-1]*banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        menu("Andi", true, "Diskon50");
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihMenu=sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem =sc.nextInt();
        int totalHarga= hitungTotalHarga(pilihMenu, banyakItem);
        System.out.print("Total harga untuk pesanan anda: Rp"+totalHarga);
    }
}
import java.util.Scanner;

public class Kafe03 {

    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang Anda inginkan");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo, double hargaTotal) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        double diskon = 0;

        if (pilihanMenu < 1 || pilihanMenu > hargaItem.length) {
            System.out.println("Menu tidak valid.");
            return hargaTotal;
        }
        if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("Anda mendapatkan diskon 50%");
            diskon = 0.5 * hargaItem[pilihanMenu - 1] * banyakItem;
        } else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("Anda mendapatkan diskon 30%");
            diskon = 0.3 * hargaItem[pilihanMenu - 1] * banyakItem;
        } else {
            System.out.println("Kode promo tidak valid.");
            diskon = 0;
        }
        hargaTotal += hargaItem[pilihanMenu - 1] * banyakItem - diskon;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihMenu, banyakItem;
        String kodePromo, lanjut;
        double hargaTotal = 0;
        menu("Andi", true);
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            System.out.print("Masukkan kode promo: ");
            kodePromo = sc.next();
            hargaTotal = hitungTotalHarga(pilihMenu, banyakItem, kodePromo, hargaTotal);
            System.out.print("Apakah transaksi ingin dilanjutkan (y/n): ");
            lanjut = sc.next();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.print("Total harga untuk pesanan Anda: Rp" + hargaTotal);
    }
}

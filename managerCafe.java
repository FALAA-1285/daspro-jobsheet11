
import java.awt.Menu;
import java.util.Scanner;

public class managerCafe {
    static int inputPenjualan(int[][] penjualan ,String[] menu){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<7; i++){
            System.err.println("================================");
            System.out.println("--Masukkan penjualan hari ke-" + (i+1)+"--");
            for(int p=0; p<5; p++){
                System.out.print("Masukkan penjualan "+menu[p]+": ");
                penjualan[p][i]=sc.nextInt();                           
            }
        }    
        return 0;
    }
    static void cetakPenjualan(int[][] penjualan, String[] menu){
        for(int i=0; i<penjualan[0].length; i++){
            System.err.println("===========================");
            System.out.println("----Penjualan hari ke-" + (i+1)+"----");
            for(int p=0; p<penjualan.length; p++){
                System.out.println("Total penjualan "+menu[p] + " : " + penjualan[p][i]);
            }
        }
    }
    static void menuTertinggi(int[][] penjualan, String[] menu){
        System.out.println("=============================");
        System.out.println("---menu Penjualan terlaris---");
        int max = 0, menutinggi=0;
        for (int i=0; i<penjualan.length; i++) {
            int  total=0;
            for(int p=0; p<penjualan[i].length; p++){
                total += penjualan[i][p];
            }
        if(total>max){
            max=total;
            menutinggi=i;
        }
        }
        System.out.println("menu paling laris: "+menu[menutinggi]);
    }
    static void  ratarataPenjualan(int[][] penjualan , String[] menu){
        System.out.println("=============================");
        System.out.println("- rata-rata Penjualan setiap menu -");
        for(int i=0; i<penjualan.length; i++){
            double total = 0;
            for(int j=0; j<penjualan[i].length; j++){
                total += penjualan[i][j];
            }
            System.out.println("rata-rata penjualan menu " + menu[i] + " : " + (total/penjualan[i].length));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penjualan[][]=new int[5][7];
        String[] menu={"kopi", "teh", "es degan", "roti Bakar", "gorengan"};
        inputPenjualan(penjualan, menu);
        cetakPenjualan(penjualan, menu);
        menuTertinggi(penjualan, menu);
        ratarataPenjualan(penjualan, menu);
        
    }
}

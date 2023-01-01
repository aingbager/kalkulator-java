import java.util.Scanner;


public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    System.out.println("\n======= PROGRAM PERHITUNGAN SEDERHANA =====\n");
    System.out.print("masukan angka pertama: ");
    int angka1 = sc.nextInt();
    System.out.print("masukan angka kedua: ");
    
    int angka2 = sc.nextInt();
    System.out.println("");

    System.out.println("pilih operasi\n1.kali\n2.bagi\n3.tambah\n4.kurang");
    System.out.print("pilih[1-4]: ");
    int pilih =sc.nextInt();

    Perhitungan hitung = new Perhitungan(angka1,angka2);

    //pilihan

    if(pilih == 1){
      hitung.showKali();
    }
    else if(pilih == 2){
      hitung.showBagi();
    }
    else if(pilih == 3){
      hitung.showTambah();
    }
    else if(pilih == 4){
      hitung.showKurang();
    }
    else{
      System.out.println("inputan salah!!!!");
    }

    System.out.println("======= PROGRAM SELESAI =====\n");
}}

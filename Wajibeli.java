package com.fdilansa.wajibeli;
import java.util.Scanner;
public class Wajibeli {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String transaksi [][] = new String [4][5];
      int harga [][] = new int [4][1];
      int kodetrs = 110;
      int baris = 0,kolom = 0;
      int pilih = 0, pilih2 = 0, hargabarang, tanggal;
      
      do {
          System.out.println("Toko Wajib Beli");  
          System.out.println("1. Transaksi Baru");
          System.out.println("2. Rekap transaksi");
          System.out.println("3. Selesai");
          System.out.print("Pilih menu = ");
          pilih = in.nextInt();
          switch(pilih){
              case 1:
                  if(baris <= 3){
                      kolom = 0;
                      transaksi[baris][kolom]= String.valueOf(kodetrs);
                      kolom = 1;
                      do {
                          //cek kapasitas kolom per transkasi
                          if(kolom <= 4) {
                          System.out.println("Pilih Barang");
                          System.out.println("1. Kalung");
                          System.out.println("2. Gelang");
                          System.out.println("3. Anting");
                          System.out.println("4. Cincin");
                          System.out.println("5. Kembali");
                          System.out.print("Pilih = ");
                          pilih2 = in.nextInt();
                          switch(pilih2){
                              case 1:
                                  transaksi[baris][kolom]= "Kalung";
                                  System.out.print("Harga Kalung = ");
                                  hargabarang = in.nextInt();
                                  harga[baris][0] = hargabarang;
                                  break;
                              case 2:
                                  transaksi[baris][kolom]= "Gelang";
                                  System.out.print("Harga Gelang = ");
                                  hargabarang = in.nextInt();
                                  harga[baris][0] = hargabarang;
                                  break;
                              case 3:
                                  transaksi[baris][kolom]= "Anting";
                                  System.out.print("Harga Anting = ");
                                  hargabarang = in.nextInt();
                                  harga[baris][0] = hargabarang;
                                  break;
                              case 4:
                                  transaksi[baris][kolom]= "Cincin";
                                  System.out.print("Harga Cincin = ");
                                  hargabarang = in.nextInt();
                                  harga[baris][0] = hargabarang;
                              case 5:
                                  System.out.println("Kembali ke menu utama");
                                  break;
                          }
                          kolom++;
                          }
                   else
                        System.out.println("Keranjang penuh");
                               break;
                      }while(pilih2 != 5);
                      baris++;
                      kodetrs++;
                  }
                  else
                  System.out.println("Transaksi penuh");
                  break;
              case 2:
                  System.out.print("Masukkan tanggal transaksi = ");
                  tanggal = in.nextInt();
                  System.out.println("Rekap Transaksi " + tanggal + " Desember 2022");
                  System.out.println("Kode\tNama Barang\tHarga");
                  for (int i = 0; i < baris; i++) {
                      for (int j = 0; j < 5; j++) {
                          if (transaksi[i][j] != null)
                          System.out.print(transaksi[i][j] + "\t"); 
                         
                      }
                      System.out.print("\t"+harga[i][0]);
                      System.out.println("");
                  }
                  break;
              case 3:
                  System.out.println("Terima kasih");
                  break;
          }
      } while(pilih!=3);
    }
}
    

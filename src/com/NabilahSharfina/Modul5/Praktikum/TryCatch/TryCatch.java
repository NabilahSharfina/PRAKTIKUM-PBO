package com.NabilahSharfina.Modul5.Praktikum.TryCatch;

import java.io.File;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        try{
            //Mencoba membaca berkas latihan.txt
            File file = new File("D:\\Data\\Diagram.txt");
            FileReader fileReader = new FileReader(file);

            //Jika berhasil maka menyampaikan pesan
            System.out.println("Read file berhasil");
        } catch(Exception e){
            //Jika terjadi kesalahan maka menampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}

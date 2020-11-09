package com.NabilahSharfina.Modul5.Latihan;

/**
 * @author Nabilah Sharfina
 * Menggunakan Prinsip Try Catch
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LatihanSoal {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int indeks;
        char lihat;
        System.out.println("\t<----------PELANGGAN---------->");
        System.out.print("Jumlah Pengunjung\t\t\t: ");
        int[] array = new int[intInputMethod()];

        System.out.println("Masukkan Data Pengunjung\t: ");
        try{
            //Menghitung jumlah pengunjung
            for (int i = 0; i < array.length; i++) {
                System.out.print("UID\t: ");
                array[i] = intInputMethod();
                System.out.println("Indeks ke-" + i + "\t\t: " + array[i] + " terdaftar!");
            }

            //Mengecek data pengunjung
            System.out.println("\nLihat Data Pengunjung\t: ");
            do {
                System.out.print("Indeks\t\t: ");
                indeks = parseInt();
                System.out.println("Data ke-" + indeks + "\t: " + array[indeks]);
                System.out.print("Lihat lagi? (Y/N)\t: ");
                lihat = br.readLine().toUpperCase().charAt(0);
            } while (lihat == 'Y');
            System.out.println("\n\t<<<===Program Selesai===>>>");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Mohon ulangi kembali! Data melebihi batas indeks");
        } catch (InputMismatchException e){
            System.out.println("Error: jangan masukkan kalimat");
        } catch (IOException e) { //Mengecek apabila ada kesalahan / error
            System.out.println(e);
        }
    }

    //Method yang digunakan untuk mendefinisikan inputan nilai indeks
    private static int parseInt() {
        Scanner scan = new Scanner(System.in);
        int indeks = scan.nextInt();
        return indeks;
    }

    //Method yang berfungsi untuk mendefinisikan inputan array length
    private static int intInputMethod() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
}

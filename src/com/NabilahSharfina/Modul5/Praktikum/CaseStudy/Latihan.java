package com.NabilahSharfina.Modul5.Praktikum.CaseStudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        System.out.print("Input Array Length\t: ");
        int[] array = new int[intInputMethod()];

        System.out.println("Input Data\t: ");
        for (int i = 0; i < array.length; i++) {
            try{
                System.out.print("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();
            } catch (InputMismatchException e){
                System.out.println("Masukkan Angka!");
                i--;
            }
        }

        System.out.println("\nOutput\t: ");
        for (int x : array){
            System.out.println("Data\t: " + x);
        }
    }

    private static int intInputMethod() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
}

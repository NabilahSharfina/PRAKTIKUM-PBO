package com.NabilahSharfina.Modul5.Praktikum.Finally;

public class Finally {
    public static void main(String[] args) {
        //Deklarasi Array
        int[] array = new int[5];
        //Try Catch Finally
        try{
            System.out.println("Akses elemen ke-5\t: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown\t: " + e);
        } finally {
            array[array.length - 1] = 10;
            System.out.println("Nilai elemen terakhir\t: " + array[array.length - 1]);
        }
    }
}

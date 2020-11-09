package com.NabilahSharfina.Modul5.Praktikum.MultipleCatch;

public class MultiTry1 {
    public static void main(String[] args) {
        //Deklarasi Array
        int[] array = new int[4];

        //Multi Try Catch
        try{
            array[4] = 20 / 0;
            System.out.println(array[4]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception");
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}

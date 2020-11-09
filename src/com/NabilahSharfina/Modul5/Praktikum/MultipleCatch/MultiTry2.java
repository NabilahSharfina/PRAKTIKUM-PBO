package com.NabilahSharfina.Modul5.Praktikum.MultipleCatch;

public class MultiTry2 {
    public static void main(String[] args) {
        //Deklarasi Array
        int[] array = new int[5];
        //Mullti Try Catch
        try{
            array[5] = 35 / 7;
            System.out.println(array[5]);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}

package com.NabilahSharfina.Modul4.Latihan;

/**
 * @author Nabilah Sharfina
 * Menggunakan Konsep Abstract Class
 */

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Salaried("Annisa", 19930418, 450000),
                new Commission("Kim", 19921204, 5000000, 320000, 7),
                new ProjectPlanner("Ashraf", 19830918, 9600000, 1200000, 4)
        };

        System.out.println("=====DATA STAFF OF 131 ENTERTAINMENT=====");
        //OUTPUT employee dengan memanggil method printInfo
        for (Employee employee : employees){
            employee.printInfo();
            System.out.println();
        }
    }
}

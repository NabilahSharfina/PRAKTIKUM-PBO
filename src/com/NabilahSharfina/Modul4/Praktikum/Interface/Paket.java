package com.NabilahSharfina.Modul4.Praktikum.Interface;

public class Paket extends Buku implements InterCD {
    long hargaPaket;
    InterCD interfaceCD;

    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }

    public void hitungHarga(){
        hargaPaket = super.hargaBuku + getHargaCD();
    }

    public long getHargaCD(){
        return (interfaceCD.getHargaCD());
    }

    public void cetakCD(){
        interfaceCD.cetakCD();
    }

    public void cetakPaket(){
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga Paket Buku dan CD\t: Rp " + hargaPaket + "\n");
    }
}

let Pegawai = {
    inputData: function(nip, nama, alamat, gajiPokok) {
      this.nip = prompt("Masukan NIP\t\t\t: ");
      this.nama = prompt("Masukan nama\t\t: ");
      this.alamat = prompt("Masukan alamat\t\t: ");
      this.gajiPokok = prompt("Masukan gaji pokok\t: ")
    },
  
    inputTunjangan: function(tunjangan) {
      this.tunjangan = prompt("Masukan tunjangan\t: ")
    },
  
    print : function() {
      console.log(`\tNIP\t\t\t: ${this.nip}`);
      console.log(`\tNama\t\t: ${this.nama}`);
      console.log(`\tAlamat\t\t: ${this.alamat}`);
      console.log(`\tGaji pokok\t: ${this.gajiPokok}`);
      console.log(`\tTunjangan\t: ${this.tunjangan}`);
      console.log(`\tTotal gaji\t: ${(this.gajiPokok * 1) + (this.tunjangan)}`)
    }
  };
  
  //Membuat objek turunan Sales
  let Sales = Object.create(Pegawai);
  
  Sales.inputTunjangan = function() {
      jmlPelanggan = prompt("Masukan jumlah pelanggan yang direkrut\t: ");
      this.tunjangan = jmlPelanggan * 50000
  };
  
  //Membuat objek turunan Satpam
  let Satpam = Object.create(Pegawai);
  
  Satpam.inputTunjangan = function(tunjangan) {
      jam = prompt("Masukan jumlah lembur (dalam jam)\t: ");
      this.tunjangan = jam * 10000
  };
  
  //Membuat objek turunan Manager
  let Manager = Object.create(Pegawai);
  
  Manager.inputTunjangan = function(tunjangan) {
    thMasuk = prompt("Masukan tahun masuk\t: ");
    lamaKerja = 2020 - thMasuk;
    if(lamaKerja <= 3)
      this.tunjangan = 5 / 100 * this.gajiPokok;
    else
      this.tunjangan = 10 / 100 * this.gajiPokok
  };
  
  const prompt = require('prompt-sync')();
  
  console.log("==========>Data Pegawai PT. ABC<==========");
  console.log("\n1.\tSATPAM");
  Satpam.inputData();
  Satpam.inputTunjangan();
  
  console.log("\n2.\tSALES");
  Sales.inputData();
  Sales.inputTunjangan();
  
  console.log("\n3.\tMANAGER");
  Manager.inputData();
  Manager.inputTunjangan();
  
  console.log("\n==========>Hasil Input Data Pegawai<==========");
  console.log("\n1.\tDATA SATPAM");
  Satpam.print();
  
  console.log("\n2.\tDATA SALES");
  Sales.print();
  
  console.log("\n3.\tDATA MANAGER");
  Manager.print();
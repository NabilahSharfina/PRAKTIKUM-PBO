const prompt = require("prompt-sync")()

//Objek Kendaraan dengan atribut plat nomor, merk, pajak
let Kendaraan = {
  //Method untuk memasukkan dan menyimpan data atribut
  inputAtribut (){
    this.nomor = prompt ("Masukkan Plat Nomor\t\t\t\t: "),
    this.merk = prompt ("Masukkan Merk Kendaraan\t\t\t: "),
    this.pajak = prompt ("Masukkan Pajak Kendaraan\t\t: ")
  },

  fasTambahan(){}, //Deklarasi method fasTambahan
  printfasTambahan(){}, //Deklarasi method printfasTambahan
  hitungPajak(){}, //Deklarasi method hitungPajak

  //Method untuk mencetak data yang telah diinput
  printData(){
    console.log("=====>INFO KENDARAAN")
    console.log(`Plat Nomor Kendaraan\t: ${this.nomor}`)
    console.log(`Merk Kendaraan\t\t\t: ${this.merk}`)
    this.printfasTambahan()
    console.log(`Pajak Kendaraan\t\t\t: ${this.pajak}`)
    console.log(`Total Pajak Kendaraan\t: ${this.hitungPajak()}`)
  }
};

//Objek Sedan turunan dari Objek Kendaraan
let Sedan = Object.create(Kendaraan)

//Method untuk menginputkan atribut tambahan
Sedan.fasTambahan = function(){
  this.fasKeamanan = prompt("Masukkan fasilitas keamanan\t\t: ")
  this.kapasitas = prompt("Masukkan fasilitas kapasitas\t: ")
  this.fasKenyamanan = prompt("Masukkan fasilitas kenyamanan\t: ")
}

//Method untuk menampilkan atribut tambahan
Sedan.printfasTambahan = function(){
  console.log(`Fasilitas keamanan\t\t: ${this.fasKeamanan}`)
  console.log(`Fasilitas kapasitas\t\t: ${this.kapasitas} CC`)
  console.log(`Fasilitas kenyamanan\t: ${this.fasKenyamanan}`)
}

//Method untuk menghitung total pajak dengan menggunakan rumus
Sedan.hitungPajak = function(){
  return (this.pajak * 1) + (this.pajak * this.kapasitas * 0.00005)
}

console.log("=====>INPUT DATA SEDAN<=====")
Sedan.inputAtribut()
Sedan.fasTambahan()
Sedan.hitungPajak()

//Objek Bus turunan dari Objek Kendaraan
let Bus = Object.create(Kendaraan)

//Method untuk menginputkan atribut tambahan
Bus.fasTambahan = function(){
  this.kapPenumpang = Number(prompt("Masukkan Kapasitas Penumpang\t: "))
  this.kapBagasi = Number(prompt("Masukkan Kapasitas Bagasi\t\t: "))
}

//Method untuk menampilkan atribut tambahan
Bus.printfasTambahan = function(){
  console.log(`Fasilitas keamanan\t: ${this.kapPenumpang}`)
  console.log(`Fasilitas kapasitas\t: ${this.kapBagasi} kg`)
}

//Method untuk menghitung total pajak dengan menggunakan rumus
Bus.hitungPajak = function(){
  return (this.pajak * 1) + (this.pajak * this.kapPenumpang * this.kapBagasi * 0.00005)
}

console.log("\n=====>INPUT DATA BUS<=====")
Bus.inputAtribut()
Bus.fasTambahan()
Bus.hitungPajak()

console.log("\n=====>DATA SELURUH KENDARAAN<=====")
//Output Objek Sedan
console.log("1.\tSedan")
Sedan.printData()

//Output Objek Bus
console.log("\n2.\tSedan")
Bus.printData()
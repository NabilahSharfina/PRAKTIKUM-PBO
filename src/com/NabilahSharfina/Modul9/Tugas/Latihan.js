/**
 * by Nabilah Sharfina
 * Menggunakan pola Object Constructor dan Menambah Prototype
 */

//Constructor Petshop
function Petshop(nama, jenis, umur, makanan, riwayatPenyakit){
  this.nama = nama
  this.jenis = jenis
  this.umur = umur
  this.makanan = makanan
  this.riwayatPenyakit = riwayatPenyakit

  //function di dalam konstruktor
  this.tampil = function(){
    console.log("Nama hewan\t\t\t: ",this.nama)
    console.log("Jenis hewan\t\t\t: ",this.jenis)
    console.log("Umur hewan\t\t\t: ",this.umur)
    console.log("Makanan hewan\t\t: ",this.makanan)
    console.log("Riwayat penyakit\t: ",this.riwayatPenyakit)
  }
}

const prompt = require("prompt-sync")() //Deklarasi prompt

/**
 * Menu Menginputkan / Menammbah Data
 */
let jumlahHewan = prompt("Jumlah hewan yang akan diinput\t: ")

var arrayHewan = [] //Deklarasi array
let hewan = {} //Deklarasi object

//Perulangan untuk membuat objek dengan constructor
for(let i = 1; i <= jumlahHewan; i++){
  console.log("\n")
  console.log(`Masukkan hewan ke-${i}\t: `)
  hewan = new Petshop(
    prompt("Masukkan nama hewan\t\t\t: "),
    prompt("Masukkan jenis hewan\t\t: "),
    prompt("Masukkan umur hewan\t\t\t: "),
    prompt("Masukkan makanan hewan\t\t: "),
    prompt("Masukkan riwayat penyakit\t: ")
  )
  //Menyimpan data array yang diinputkan
  arrayHewan.push(hewan)
}

console.log("")

/**
 * Menu mengedit data
 */
var editData = prompt("Ingin mengubah data? [Ya / Tidak]\t: ")

if(editData == "Ya"){
  console.log("")
  var noHewan = prompt("Masukkan urutan hewan yang ingin diubah\t: ")
  var namaData = prompt("Masukkan data yang ingin diubah [Nama/Jenis/Umur/Makanan/RiwayatPenyakit]\t: \n=>\t")

  //Menambah property ke dalam objek
  if(namaData == "Nama"){
    let index = noHewan - 1
    arrayHewan[index].nama = prompt(`Masukkan nama hewan baru ke-${noHewan}\t: `)
  } else if(namaData == "Jenis") {
    let index = noHewan - 1
    arrayHewan[index].jenis = prompt(`Masukkan jenis hewan baru ke-${noHewan}\t: `)
  } else if(namaData == "Umur"){
    let index = noHewan - 1
    arrayHewan[index].umur = prompt(`Masukkan umur hewan baru ke-${noHewan}\t: `)
  } else if(namaData == "Makanan"){
    let index = noHewan - 1
    arrayHewan[index].makanan = prompt(`Masukkan makanan baru ke-${noHewan}\t: `)
  } else if(namaData == "RiwayatPenyakit"){
    let index = noHewan - 1
    arrayHewan[index].riwayatPenyakit = prompt(`Masukkan riwayat penyakit ke-${noHewan}\t: `)
  } else {
    console.log("Inputan tidak sesuai")
  }

  console.log("\nData hewan yang berhasil disimpan")
  
  /**
   * Menu Menampilkan Data yang Tersimpan
   */
  let index = 1
  for(let x in arrayHewan){
    console.log(`\nHewan ke-${index}`)
    index++
    arrayHewan[x].tampil()
  }
} else if(editData == "Tidak"){
  console.log("\nData hewan yang berhasil disimpan")
  
  let index = 1
  for(let x in arrayHewan){
    console.log(`\nHewan ke-${index}`)
    index++
    arrayHewan[x].tampil()
  }
} else {
  console.log("\nInputan tidak sesuai")
}

/**
 * Menu Exit
 */
console.log("\nBYE!")
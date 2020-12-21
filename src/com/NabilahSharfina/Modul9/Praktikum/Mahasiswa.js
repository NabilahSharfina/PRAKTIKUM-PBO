//Constructor Mahasiswa
function Mahasiswa(nim, nama, prodi){
    this.nim = nim
    this.nama = nama
    this.prodi = prodi
  
    //Menambah method pada constructor
    this.tampil = function(){
      console.log("NIM\t\t: ", this.nim)
      console.log("Nama\t: ", this.nama)
      console.log("Prodi\t: ", this.prodi)
    }
  }
  
  //Deklarasi input dengan prompt
  const prompt = require("prompt-sync")()
  let jumlahMahasiswa = prompt("Masukkan jumlah Mahasiswa\t: ")
  
  var arrayMahasiswa = [] //Array mahasiswa
  let mahasiswa = {} //Objek mahasiswa
  
  //Pembuatan object dengan constructor
  for(let i = 1; i <= jumlahMahasiswa; i++){
    console.log(`Mahasiswa ke-${i}`)
    mahasiswa = new Mahasiswa(
      prompt("Masukkan NIM\t: "),
      prompt("Masukkan Nama\t: "),
      prompt("Masukkan Prodi\t: ")
    )
    arrayMahasiswa.push(mahasiswa)
  }
  
  console.log("Data berhasil tersimpan\n")
  
  var editData = prompt("Ingin mengubah data? Ya / Tidak\t: ")
  
  if(editData == "Ya"){
    var noMahasiswa = prompt("Masukkan no. urut mahasiswa\t: ")
    //Tambah fungsi baru ke constructor
    Mahasiswa.prototype.edit = function(){
      nim = prompt(`Masukkan NIM\t: `),
      nama = prompt(`Masukkan Nama\t: `),
      prodi = prompt(`Masukkan Prodi\t: `)
      
      tampil = this.tampil
      return {nim, nama, prodi, tampil}
    }
  
    let index = noMahasiswa - 1
    arrayMahasiswa[index] = arrayMahasiswa[index].edit()
  
    console.log("\nData setelah diubah")
    index = 1
    for(let x in arrayMahasiswa){
      console.log(`Mahasiswa ke-${index}`)
      index++
      arrayMahasiswa[x].tampil()
    }
  } else if(editData == "Tidak"){
    let index = 1
    index = 1
    for(let x in arrayMahasiswa){
      console.log(`Mahasiswa ke-${index}`)
      index++
      arrayMahasiswa[x].tampil()
    }
  } else {
    console.log("Pilihan tidak sesuai")
  }
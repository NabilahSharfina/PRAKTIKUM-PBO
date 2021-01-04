/**
 * by Nabilah Sharfina
 * Menggunakan object pattern untuk data Mahasiswa
 * Menggunakan function minimal 3
 */

//Function untuk menggabungkan 2 object
function Mix(mahasiswa, nilai) {
    for(let property in nilai) {
      if(nilai.hasOwnProperty(property)) {
        mahasiswa[property] = nilai[property]
      }
    }
  
    return mahasiswa
  }
  
  function Mahasiswa() {
    let name
    let tglLahir
    let age
    let nim
    let prodi
  
    this.initial = function(newName, newTglLahir, newNim, newProdi) {
      name = newName
      nim = newNim
      tglLahir = newTglLahir
      age = 2021 - (tglLahir.slice(tglLahir.length - 4))
      prodi = newProdi
    }
  
    this.getName = function() {
      return name
    }
  
    this.getTglLahir = function() {
      return tglLahir
    }
  
    this.getAge = function() {
      return age
    }
  
    this.getNim = function() {
      return nim
    }
  
    this.getProdi = function() {
      return prodi
    }
  
    this.getPeringkat = function() {
      if(!Mahasiswa.hasOwnProperty("peringkat"))
        return null
      else
        return peringkat
    }
  }
  
  function Nilai() {
    let nilai
    let peringkat
  
    this.setNilai = function(newNilai) {
      nilai = newNilai;
  
    if(100 >= nilai && nilai >= 80)
      peringkat = "A"
    else if(80 > nilai && nilai >= 60)
      peringkat = "B"
    else if(60 > nilai && nilai >= 40)
      peringkat = "C"
    else
      peringkat = "D"
    }
  
    this.getNilai = function() {
      return nilai
    }
  
    this.getPeringkat = function() {
      return peringkat
    }
  }
  
  //Membuat class object
  const mahasiswa = new Mahasiswa()
  const nilai = new Nilai()
  
  const prompt = require("prompt-sync")();
  
  //Menu pilihan input program
  let isExit = false;
  do {
    console.log("=====>MENU PENILAIAN<=====")
    console.log("1.\tTambah Mahasiswa")
    console.log("2.\tPenilaian")
    console.log("3.\tLihat Seluruh Mahasiswa")
    console.log("4.\tKeluar")
  
    let pilihan = prompt("Masukkan pilihan\t: ");
    console.log("");
  
    switch(pilihan) {
      //Menambah inputan jumlah mahasiswa
      case "1":
        console.log("=====>Tambah Mahasiswa<=====")
        const nama = prompt("Input Nama\t: ")
        const tglLahir = prompt("Input TL\t: ")
        const nim = prompt("Input NIM\t: ")
        console.log("")
  
        console.log("=====>Pilih Prodi")
        console.log("1.\tS1 SE")
        console.log("2.\tS1 IF")
        console.log("3.\tS1 SI")
  
        let prodi = prompt("Masukkan pilihan\t: ")
        console.log("")
  
        if(prodi == 1)
          prodi = "S1 SE"
        else if(prodi == 2)
          prodi = "S1 IF"
        else if(prodi === 3)
          prodi = "S1 SI"
        else
          prodi = "Inputan salah!"
  
        mahasiswa.initial(nama, tglLahir, nim, prodi)
        console.log("")
        break
  
      //Menambah inputan nilai
      case "2": 
        console.log("=====>Penilaian<=====")
        prompt("Masukan NIM\t\t: ")
        const value = prompt("Masukan Nilai\t: ")
        console.log("")
  
        nilai.setNilai(value)
        Mix(mahasiswa, nilai)
        break
  
      //Lihat Seluruh Mahasiswa
      case "3":   
        console.log("=====>Data Mahasiswa<=====\n")
        console.log(`Nama\t: ${mahasiswa.getName()}`)
        console.log(`TL\t\t: ${mahasiswa.getTglLahir()}`)
        console.log(`Umur\t: ${mahasiswa.getAge()}`)
        console.log(`NIM\t\t: ${mahasiswa.getNim()}`)
        console.log(`Prodi\t: ${mahasiswa.getProdi()}`)
        console.log(`Grade\t: ${mahasiswa.getPeringkat()}`)
        console.log("")
        break
  
      //Keluar
      case "4":
        isExit = true
        console.log("Bye!!!")
        break
  
      //Jika inout selain angka 1-4 
      default: 
        console.log("Error!")
        break
    }
  }while(!isExit)
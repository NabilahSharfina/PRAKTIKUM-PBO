/**
 * by Nabilah Sharfina
 * Menggunakan pola Method & Function Object
 * Membuat Program Penilaian
 */

//
const prompt = require(`prompt-sync`)()
let listMahasiswa = [] //Deklarasi array

//Constructor Mahasiswa
function Mahasiswa(nama, tl, nim, prodi) {
  this.nama = nama;
  this.tl = tl;
  this.nim = nim;
  this.prodi = prodi;

  this.nilai = -1;

  Object.defineProperty(this, "grade", {
    get() {
      if(80 <= this.nilai && this.nilai <= 100)
        return "A"
      else if(60 <= this.nilai && this.nilai < 80)
        return "B"
      else if(40 <= this.nilai && this.nilai < 60)
        return "C"
      else if(0 <= this.nilai && this.nilai < 40)
        return "D"
      else
        return null
    }
  })

  Object.defineProperty(this, "umur", {
    get() {
      return 2020 - (this.tl.slice(this.tl.length - 4))
    }
  })

  this.tampil = function(){
    console.log("Nama\t: ", this.nama)
    console.log("TL\t\t: ", this.tl)
    console.log("Umur\t: ", this.umur)
    console.log("NIM\t: ", this.nim)
    console.log("Prodi\t: ", this.prodi)
    console.log("Grade\t: ", this.grade)
  }
}

const Menu = {
  exit : false,

  start(){
    do{
      console.log("======>MENU PENILAIAN<======")
      console.log("1.\tTambah Mahasiswa")
      console.log("2.\tPenilaian")
      console.log("3.\tLihat Seluruh Mahasiswa")
      console.log("4.\tKeluar")
      console.log()

      let nomor = prompt(`Masukkan Pilihan\t: `) 

      switch(nomor){
        case "1": //Menmbah mahasiswa
          Menu.Tambah.mahasiswa()
          break
        case "2": //Daftar penilaian
          Menu.Tambah.nilai()
          break
        case "3": //Hasil keseluruhan
          Menu.Tampilkan.mahasiswa()
          break
        case "4": //Keluar
          Menu.exit = true
          console.log("BYE!")
          break
        default:
          console.log("\nInputan tidak valid!")
      }
    } while(!Menu.exit)
  },

  Tambah : {
    mahasiswa(){
      console.log("\n======>TAMBAH MAHASISWA<======")
      const nama = prompt("Input Nama\t: ")
      const tl = prompt("Input TL\t: ")
      const nim = prompt("Input NIM\t: ")
      
      Menu.input.dataMahasiswa(nama, tl, nim)
    },

    nilai(){
      console.log("\n======>PENILAIAN<======")
      const nim = prompt("Masukkan NIM\t: ")
      const nilai = Number(prompt("Masukkan Nilai\t: "))

      Menu.input.inputNilai(nim, nilai)
    }
  },

  Tampilkan : {
    mahasiswa(){
      let count = 1
      for(let mahasiswa of listMahasiswa){
        console.log(`Mahasiswa ke-${count}`)
        mahasiswa.tampil()
        console.log("")
        count++
      }
    }
  },

  Input : {
    menuProdi(){
      do{
        console.log("\n======>PILIH PRODI")
        console.log("1.\tS1 SE")
        console.log("2.\tS1 IF")
        console.log("3.\tS1 SI")
        console.log()

        let no = Number(prompt("Input Prodi\t: "))
        
        if(no == 1){
          return "S1 SE"
        } else if(no == 2){
          return "S1 IF"
        } else if(no == 3){
          return "S1 SI"
        } else{
          console.log("Inputan tidak terdaftar!")
        }
      } while(true)
    },

    // Proses memasukan data mahasiswa ke program
    dataMahasiswa(nama, tl, nim) {
      console.log()
      const prodi = Menu.input.menuProdi()
      
      listMahasiswa.push(new Mahasiswa(nama, tl, nim, prodi))
    },

    // Proses memasukan nilai mahasiswa
    dataNilai(nim, nilai){
      let ketemu = true
      for(let mahasiswa of listMahasiswa) {
        if(mahasiswa.nim === nim) {    
          mahasiswa.nilai = nilai 
          ketemu = false
        }
      }
      if(ketemu)
        console.log("Mahasiswa tidak terdaftar!")
    }
  }
}

Menu.start()
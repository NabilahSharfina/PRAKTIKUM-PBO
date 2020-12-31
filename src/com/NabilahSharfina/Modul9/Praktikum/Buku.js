//Constructor Buku
function Buku(judul, pengarang, penerbit, tahun){
    this.judul = judul
    this.pengarang = pengarang
    this.penerbit = penerbit
    this.tahun = tahun
  
    //Function di dalam constructor
    this.tampil = function(){
      console.log(`Judul\t\t: `, this.judul)
      console.log(`Pengarang\t: `, this.pengarang)
      console.log(`Penerbit\t: `, this.penerbit)
      console.log(`Tahun\t\t: `, this.tahun)
    }
  }
  
  //Deklarasi prompt
  const prompt = require(`prompt-sync`)()
  
  let jumlahBuku = prompt(`Jumlah buku yang akan diinput\t: `)
  
  var arrayBuku = [] //Deklarasi array buku
  let buku = {} //Deklarasi Objek
  
  //Perulangan untuk membuat objek dengan constructor
  for(let i = 1; i <= jumlahBuku; i++){
    console.log("\n")
    //Membuat objek dengan constructor
    buku = new Buku(
      prompt(`Masukkan judul buku ke-${i}\t: `),
      prompt(`Masukkan nama pengarang\t: `),
      prompt(`Masukkan nama penerbit\t: `),
      prompt(`Masukkan tahun terbit\t: `)
    )
    arrayBuku.push(buku)
  }
  
  console.log(`\n`)
  
  var editData = prompt(`Ingin mngubah data?[Ya / Tidak]\t: `)
  
  if(editData == "Ya"){
    var noBuku = prompt(`Masukkan urutan buku yang ingin diubah\t: `)
    var namaData = prompt(`Masukkan data yang ingin diubah [Judul/Pengarang/Penerbit/Tahun]\t: `)
  
    //Menambah property ke dalam objek
    if(namaData == "Judul"){
      let index = noBuku - 1
      arrayBuku[index].judul = prompt(`Masukkan Judul Buku Baru ke-${noBuku}\t: `)
    } else if (namaData == "Pengarang"){
      let index = noBuku - 1
      arrayBuku[index].pengarang = prompt(`Masukkan Pengarang Baru ke-${noBuku}\t: `)
    } else if (namaData == "Penerbit"){
      let index = noBuku - 1
      arrayBuku[index].penerbit = prompt(`Masukkan Penerbit Baru ke-${noBuku}\t: `)
    } else if (namaData == "Tahun Terbit"){
      let index = noBuku - 1
      arrayBuku[index].tahun = prompt(`Masukkan Tahun Terbit Buku ke-${noBuku}\t: `)
    } else {
      console.log(`Pilihan tidak sesuai`)
    }
    
    console.log(`\nData buku yang berhasil disimpan`)
  
    let index = 1
    for(let x in arrayBuku){
      console.log(`\nBuku ke-${index}`)
      index++
      arrayBuku[x].tampil()
    }
  } else if (editData == "Tidak"){
      console.log("\nData buku yang berhasil disimpan")
  
      let index = 1
    
      for(let x in arrayBuku){
        console.log(`\nBuku ke-${index}`)
        index++
        arrayBuku[x].tampil()
      }
    } else {
      console.log("\nPilihan tidak sesuai")
    }
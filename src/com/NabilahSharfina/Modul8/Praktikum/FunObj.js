//Deklarasi input dengan prompt
const prompt = require(`prompt-sync`)()

let total = prompt(`Berapa mahasiswa?\t: `)

var array = []

for(let i = 0; i < total; i++){
  console.log(`\nMahasiswa ${i}`)

  let name = prompt(`\tMasukkan Nama\t: `)
  let nim = prompt(`\tMasukkan NIM\t: `)
  let birth = prompt(`\tMasukkan TL\t\t: `)

  let mahasiswa = new Mahasiswa(name, nim, birth)
  array.push(mahasiswa)
}

let index = 0

for(let x in array){
  console.log(`\nMahasiswa\t: ${index}`)
  index++
  console.log(`\tNama\t: ${array[x].name}`)
  console.log(`\tTL\t\t: ${array[x].birth}`)
  console.log(`\tNIM\t\t: ${array[x].nim}`)
  console.log(`\tUmur\t: ${array[x].age()}`)
}

function Mahasiswa(name, nim, birth){
  this.name = name
  this.nim = nim
  this.birth = birth
  this.age = function(){
    //Function slice untuk mendapatkan nilai dari ke n sampai akhir 
    let year = this.birth.slice(this.birth.length - 4)
    return 2020 - year
  }
}
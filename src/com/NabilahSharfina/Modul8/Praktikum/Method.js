//Deklarasi input dengan prompt 
const prompt = require ('prompt-sync')()

let total = prompt('Berapa Mahasiswa?\t: ')

var array = []//Deklarasi array [tanpa value]
var mahasiswa = {}//Deklarasi object tanpa value

for (let i = 0; i < total; i++)
{
  console.log(`\nMahasiswa ${ i }`)
  mahasiswa = new Object(
    {
      name : prompt('Masukkan nama\t\t\t: '),
      birth : prompt('Masukkan tanggal lahir\t: '),
      nim : prompt('Masukkan Nim\t\t\t: '),
      age : function()
      {
        //Function slice untuk mendapatkan nilai dari ke n sampai akhir
        let year = this.birth.slice(this.birth.length - 4)
        return 2020 - year
      }
    }
  )
  array.push(mahasiswa)
}

let index = 0

for(let x in array)
{
  console.log(`\nMahasiswa\t\t: ${ index }`)
  index++ 
  console.log(`Nama\t\t\t: ${ array[x].name }`)
  console.log(`Tanggal Lahir\t: ${ array[x].birth }`)
  console.log(`NIM\t\t\t\t: ${ array[x].nim }`)
  console.log(`Age\t\t\t\t: ${ array[x].age() }`)
}
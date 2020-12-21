//Deklarasi input dengan prompt
const prompt = require(`prompt-sync`)()

let object = {}
object.name = prompt(`Input Nama\t: `)
object.age = prompt(`Input Age\t: `)
object.nim = prompt(`Input NIM\t: `)
object.prodi = prompt(`Input Prodi\t: `)

console.log("")

//Perulangan for each untuk mendapatkan nama property
for(property in object){
  //Print nama property dan value-nya
  console.log(property + `\t: ${object[property]}`)
}
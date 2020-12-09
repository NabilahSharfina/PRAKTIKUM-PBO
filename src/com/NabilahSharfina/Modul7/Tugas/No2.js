/**
 * by Nabilah Sharfina
 * Program mencari nilai rata-rata
 */

//Input Nama Orang
let person = {
    firstName : "Nabilah",
    lastName : "Sharfina"
};

let value = [95, 80, 85, 70, 85];

//Fungsi untuk mencari nilai rata-rata
function Average(){
    let total = 0;
    for (let i = 0; i < value.length; i++) {
        total = total + value[i];
    }
    let average = total / value.length;
    return average;
}

//OUTPUT
console.log("Nama Mahasiswa\t: " + person.firstName + " " + person.lastName);
console.log("Rata-rata nilai\t: " + Average());
/**
 * by Nabilah Sharfina
 * Menghitung nilai indeks Fibonacci
 */

var bil = 11 //Jumlah indeks yang muncul
const fibo = [] //Deklarasi Array untuk menampung atau menyimpan nilai

//Array untuk menginisialisasi nilai dari sebuah indeks
fibo[0] = 0
fibo[1] = 1

//Menghitung nilai menggunakan rumus Fibonacci
for (let index = 2; index < bil; index++) {
    fibo.push(fibo[index - 1] + fibo[index - 2])
}

//Output
console.log('Fibonacci\t: [' + fibo.join(', ') + ']')
console.log('Result\t\t: ' + fibo[fibo.length - 1])
/**
 * by Nabilah Sharfina
 * Menghitung bilangan prima
 */

var max = 50 //Nilai max output
var bilPrima = []

//Mengecek angka yang termasuk bilangan prima
for (var i = 2; i <= max; i++) {
    bilPrima = false
    for (var j = 2; j < i; j++) {
        if(i % j == 0) {
            bilPrima = true
        }
    }
       
    //Output
    if(bilPrima == false){
        console.log('Bilangan Prima\t: ' + i)
    }
}
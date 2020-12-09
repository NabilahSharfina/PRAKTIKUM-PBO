/**
 * by Nabilah Sharfina
 * Program mencari nilai max dan nilai min
 */

let value = [5, 6, 2, 3, 7];

//Fungsi untuk mencari nilai rata-rata
function Average(){
    let total = 0;
    for (let i = 0; i < value.length; i++) {
        total = total + value[i];
    }
    let average = total / value.length;
    return average;
}

//Fungsi untuk mencari nilai maximum
function Maximum(){
    let max = value[0];
    for (let x = 0; x < value.length; x++) {
        if (value[x] > max) {
            max = value[x];
        }
    }
    return max;
}

//Fungsi untuk mencari nilai minimum
function Minimum(){
    let min = value[0];
    for (let y = 0; y < value.length; y++) {
        if (value[y] < min) {
            min = value[y];
        }
    }
    return min;
}

//OUTPUT
console.log("Nilai\t\t\t: " + value);
console.log("Rata-rata\t\t: " + Average());
console.log("Nilai Maksimum\t: " + Maximum());
console.log("Nilai Minimum\t: " + Minimum());
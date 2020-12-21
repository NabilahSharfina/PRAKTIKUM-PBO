//Membuat fungsi dengan 1 parameter
function reflect(value){
    return value;
}

//Menampilkan fungsi
console.log(reflect("Hey yoo!"));
console.log(reflect("Hari ini aku banyak rebahan", 3, "kali"));
console.log("Panjang argumen\t: ", reflect.length);

///Me-redefinisi fungsi reflect
reflect = function(){
    return arguments[0];
}

//Menampilkan fungsi
console.log(reflect("Hey yoo!"));
console.log(reflect("Hari ini aku banyak rebahan", 3, "kali"));
console.log("Panjang argumen\t: ", reflect.length);
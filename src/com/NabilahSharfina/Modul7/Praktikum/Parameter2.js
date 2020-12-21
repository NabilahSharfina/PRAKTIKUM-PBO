//Membuat fungsi tanpa parameter / argumen
function sum(){
    var result = 0,
    i = 0,
    len = arguments.length;

    //Melakukan perulangan sebanyak argumen yang diinputkan
    while(i < len){
        result += arguments[i];
        i++;
    }
    return result; 
}

console.log(sum(1,3));
console.log(sum(12, 5, 2, 1));
console.log(sum());
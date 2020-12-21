/**
 * by Nabilah Sharfina
 * Program mencari nilai dan predikat
 */

//Fungsi untuk menginput nama
function myFunction(name, value) {
    this.Name = name;
    this.Value = value;
}

//Fungsi untuk mencari predikat nilai 
function Grade (value){
    if (value >= 85 && value <= 100){
        return "A";
    }

    else if (value > 75 && value <= 84){
        return "B";
    }
    
    else if (value >= 65 && value <= 75){
        return "BC";
    }

    else if (value >= 55 && value <= 64){
        return "C";
    }

    else if (value >= 45 && value <= 54){
        return "D";
    }

    else if (value >= 0 && value <= 44){
        return "E";
    }

    else {
        return "Error!";
    }
}

let add = new myFunction("Bambang Susilo", 78);
let result = Grade(add.Value);

//OUTPUT
console.log("Masukkan Nama\t: " + add.Name);
console.log("Masukkan Nilai\t: " + add.Value);
console.log(add.Name + ", kamu mendapat predikat " + result);
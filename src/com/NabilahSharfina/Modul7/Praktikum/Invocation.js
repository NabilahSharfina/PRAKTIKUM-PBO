//Contoh 1
function myFunction1(x, y, z){
    console.log("Hello everyone, my name is ", x);
    console.log("Now, I ", y, " years old");
    console.log("My hobby is ", z);
}

console.log("\nOutput Contoh 1\t:")
//Melakukan invokasi fungsi
myFunction1("Nabilah Sharfina", 19, "Cycling");

//Contoh 2
function myFunction2(arg1, arg2){
    this.firstName = arg1;
    this.lastName = arg2;
}

//Membuat objek dari fungsi myFunction
var add = new myFunction2("Fani", "Zain");

//Memanggil fungsi dari properti yang ada di dalam fungsi
console.log("\nOutput Contoh 2\t:\n" + add.firstName + " " + add.lastName)
//Membuat method person
var person = {
    fullName : function(){
        return this.firstName + " " + this.lastName;
    }
}

var person1 = {
    firstName : "Nabilah",
    lastName : "Sharfina"
}

var person2 = {
    firstName : "Fani",
    lastName : "Zain"
}

console.log("Menggunakan method call untuk menampilkan objek person 2\t:")
//Memanggil method menggunakan method call()
console.log(person.fullName.call(person2));
var person = {
    fullName : function(birth, city){
        return this.firstName + " " + this.lastName +
        "," + birth + "," + city;
    }
};

var person1 = {
    firstName : "Nabilah",
    lastName : "Sharfina"
};

var person2 = {
    firstName : "Fani",
    lastName : "Zain"
};

//Menggunakan apply()
console.log(person.fullName.apply(person1, ["April", "Mojokerto"]));
console.log(person.fullName.apply(person2, ["July", "Mojokerto"]));

//Jika menggunakan call() -> person.fullName.call(person1, "April", "Mojokerto");
//dst.
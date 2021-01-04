var Person = (function(){
    var age = 21

    return{
        name : "Kim",
        getAge : function(){
            return age
        },

        growOlder : function(){
            age++
        }
    }
}())

console.log("Nama person\t\t\t: ", Person.name)
console.log("Umur person\t\t\t: ", Person.getAge())

//Mengganti umur
Person.age = 100
console.log("Umur yang diganti\t: ", Person.getAge())

Person.growOlder()
console.log("Umur yang ditambah\t: ", Person.getAge())
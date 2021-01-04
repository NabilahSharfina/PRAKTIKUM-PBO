var person = (function(){
    var age = 25

    function getAge(){
        return age
    }

    function growOlder(){
        age++
    }

    return{
        name : "Nabilah",
        getAge : getAge,
        growOlder : growOlder
    }
}())

console.log("Nama person\t\t\t: ", person.name)
console.log("Umur person\t\t\t: ", person.getAge())

//Mengganti umur
person.age = 100
console.log("Umur yang diganti\t: ", person.getAge())

person.growOlder()
console.log("Umur yang ditambah\t: ", person.getAge())
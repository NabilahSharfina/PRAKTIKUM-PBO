var Person = (function(){
    var age = 21

    function InnerPerson(name){
        this.name = name
    }

    InnerPerson.prototype.getAge = function(){
        return age
    }

    InnerPerson.prototype.growOlder = function(){
        age++
    }

    return InnerPerson
}())

var person1 = new Person("Burak")
var person2 = new Person("Leyla")

console.log("Nama person\t\t: ", person1.name)
console.log("Umur person\t\t: ", person1.getAge())

console.log("Nama person\t\t: ", person2.name)
console.log("Umur person\t\t: ", person2.getAge())

console.log()

//Penambahan umur
person1.growOlder()
console.log(`Umur ${person1.name} yang ditambah\t: `, person1.getAge())
console.log(`Umur ${person2.name} yang ditambah\t: `, person2.getAge())
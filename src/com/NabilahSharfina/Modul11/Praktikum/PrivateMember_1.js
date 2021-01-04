function Person(name){
    var age = 31 //Definisi variabel private

    this.name = name

    this.getAge = function(){
        return age
    }

    this.growOlder = function(){
        age++
    }
}

var person = new Person("Eric Nam")

console.log("Name person\t\t\t: ", person.name)
console.log("Umur person\t\t\t: ", person.getAge())

//Mengganti umur
person.age = 100
console.log("Umur yang diganti\t: ", person.getAge())

person.growOlder()
console.log("Umur yang ditambah\t: ", person.getAge())
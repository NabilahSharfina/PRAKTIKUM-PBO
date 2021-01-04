//Function penggabungan 2 object
function Mixin(receiver, supplier){
    for(var property in supplier){
        if(supplier.hasOwnProperty(property)){
            receiver[property] = supplier[property]
        }
    }

    return receiver
}

//Module pattern
var person = (function(){
    var name = "Wheein"
    var age = 26

    function setName(newName){
        name = newName
    }

    function getName(){
        return name
    }

    function getAge(){
        return age
    }

    return{
        setName : setName,
        getName : getName,
        getAge : getAge
    }
}())

//Private member
var Title = (function(){
    var element = "Music"

    function InnerTitle(title){
        this.title = title
        this.element = element
    }

    return InnerTitle
}())

person.setName("Maria")
var title = new Title("Singer")

//Penggabungan 2 object
Mixin(person, title)

console.log("Name\t: ", person.getName())
console.log("Age\t\t: ", person.getAge())
console.log("Title\t: ", person.title)
console.log("Element\t: ", person.element)
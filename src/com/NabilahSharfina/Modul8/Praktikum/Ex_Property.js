//Lanjutkan dengan value
var person1 = {
    name : "Fina"
  }
  
  var person2 = new Object()
  person2.name = "Fani"
  
  //Menambahkan property baru
  person1.age = 19
  person2.age = 18
  
  //Akses property dengan cara pertama
  console.log(`Object dari person1\t:
  \n\tName\t: ${person1.name}
  \n\tAge\t\t: ${person1.age}`)
  
  console.log("")
  
  //Akses property dengan cara kedua
  console.log(`Object dari person2\t:
  \n\tName\t: ${person2["name"]}
  \n\tAge\t\t: ${person2["age"]}`)
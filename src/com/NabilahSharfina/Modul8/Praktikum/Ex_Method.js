var person = {
    firstName : "Nabilah",
    lastName : "Sharfina",
    year : 2001,
    fullName : function(){
      //Mengembalikan nilai dengan return
      //this merujuk pada object person
      return(this.firstName + " " + this.lastName)
    },
    age : function(){
      //Mengembalikan nilai dengan return
      return 2020 - this.year
    }
  }
  
  //Akses property dengan cara kedua 
  console.log(`Object dari person\t:
  \n\tName\t: ${person.fullName()}
  \n\tYear\t: ${person.year}
  \n\tAge\t\t: ${person.age()}`)//Memanggil method dalam object
var bilangan

//1 Kondisi
bilangan = 10
if(bilangan == 10){
    console.log('Variabel bilangan memiliki nilai\t: ' + bilangan)
}

//2 Kondisi
bilangan = 8
if(bilangan % 2 == 0){
    console.log(bilangan + ' adalah bilangan genap')
} else{
    console.log(bilangan + ' adalah bilangan ganjil')
}

//3 Kondisi
bilangan = -0.5
if(bilangan > 0){
    console.log(bilangan + ' adalah bilangan positif')
} else if(bilangan < 0){
    console.log(bilangan + ' adalah bilangan negatif')
} else{
    console.log(bilangan + ' adalah bilangan netral')
}
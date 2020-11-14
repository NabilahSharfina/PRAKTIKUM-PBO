//For Loop
for (var i = 0; i < 5; i++)
    console.log(i + ".\tBermimpi")
    console.log('\n')

//For / in
var nama = [{NamaDepan : 'Eric', NamaBelakang : 'Nam', age : 32}, {NamaDepan : 'Emma', NamaBelakang : 'Watson', age : 29}]
for (var x in nama) {
    console.log('Idola\t: ')
    console.log(nama[x].NamaDepan)
    console.log(nama[x].NamaBelakang)
    console.log(nama[x].age)
    console.log('\n')
}

//For / of
var buah = ['Durian', 'Nangka', 'Lemon']
for(var x of buah){
    console.log('Ini namanya buah ' + x)
}
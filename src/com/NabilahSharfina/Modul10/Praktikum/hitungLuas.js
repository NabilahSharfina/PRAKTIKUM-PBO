//Constructor Persegi Panjang
function PersegiPanjang(panjang, lebar) {
    this.panjang = panjang;
    this.lebar = lebar
  }
  
  PersegiPanjang.prototype.getLuas = function() {
    const luas = this.panjang * this.lebar;
    console.log(`Luas\t= ${this.panjang} x ${this.lebar}`);
    console.log(`\t\t= ${luas}`)
  };
  
  PersegiPanjang.prototype.print = function() {
      console.log(`Panjang sisi\t: ${this.panjang}`);
      console.log(`Lebar sisi\t\t: ${this.lebar}`)
  };
  
  // Mewarisi properti Persegi Panjang
  function Persegi(sisi) {
      this.panjang = sisi;
      this.lebar = sisi;
  }
  
  Persegi.prototype = new PersegiPanjang();
  Persegi.prototype.constructor = PersegiPanjang;
  
  Persegi.prototype.print = function() {
      console.log(`Panjang sisi\t: ${this.panjang}`)
  };
  
  const prompt = require("prompt-sync")();
  console.log("PERSEGI PANJANG");
  
  let obPersegiPanjang = new PersegiPanjang(
      prompt("Masukan panjang\t: "),
      prompt("Masukan lebar\t: ")
  );
  
  console.log("\nPERSEGI");
  
  let obPersegi = new Persegi(
      prompt("Masukan panjang sisi\t: ")
  );
  
  console.log("\nMenghitung luas persegi panjang");
  obPersegiPanjang.print();
  obPersegiPanjang.getLuas();
  
  console.log("\nMenghitung luas persegi");
  //Memanggil method dari parent constructor
  obPersegi.print();
  obPersegi.getLuas();
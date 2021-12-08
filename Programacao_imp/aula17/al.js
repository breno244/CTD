// .map-------------------------------



let numeros = [1,5,9,3,5,7];
let dobro = numeros.map(function(item){
    return item * 2;
});



// filter---------------------------



console.log(dobro);

let idades = [15,12,16,20,25,30,36,4,18];

let maiores = idades.filter(function(item) {
    
    return item >= 18;
});
console.log(maiores);

let total = idades.reduce(function(acumulador, item) {
    return acumulador+' - '+item;
});



// forEach----------------------------------



console.log(total);

let paises = ['Brasil', 'Cuba', 'Peru', 'India'];

paises.forEach(function(item) {
    console.log("<li>"+item+"</li>");
});


// Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.

let numPares = [2,4,6,8,10,12,14,16]

let numImpares
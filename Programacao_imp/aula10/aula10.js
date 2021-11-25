let nome="  Breno Sabino  ";
console.log (nome.length);

console.log(   nome  );
console.log(   nome.trim()  ); 
nome = nome.trim();
console.log(   nome.split("  ") );

let lista= ["BRENO", "LUCAS", "MARCOS", 122, true, "Gabi"];
console.log(lista);
console.log(lista[2]);
lista[4] = "novo";
lista.push("zip", "ok");
console.log(lista);

let y = lista.shift ();
console.log(lista);
console.log(y)

lista.unshift("Ze", "Joao");
console.log(lista);
// coloca os dados a frente 

let strLista = lista.join("|");
console.log(strLista);

lista.push("Joao");
console.log(lista);

console.log
function centimetros(x) {

    return (2.54*x);
}

console.log(centimetros (5));

//2 Crie uma função que receba uma string e a converta em um URL.
//ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"

function url(x) {
    return("http://www." + x + ".com.br");
}

console.log(url ("funcaojs"));


//Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).
function exclamacao(x) {
    return(x + "!");
}
console.log(exclamacao("ola"));

//4 Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.
function idadeDoCao(x){
return(x+7);
}
console.log(idadeDoCao(6));

//5 Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
Function valors
let usuario;
usuario = prompt("Insira seu mome abaixo");

// alert("usuario " + usuario + "logado com sucess!!!")

let resp;
resp = confirm("Voçe realmente quer sair da pagina"); 

console.log(resp)

if(resp) {
    alert("A sessao foi encerrada !!!");

} else {
    alert("A sessao nao foi encerrada :)");

}

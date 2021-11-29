function podeSubir(altura, veioAcompanhado) {
    if(altura > 1.40 && altura < 2) {
        return console.log(true)
    } else if ((altura < 1.40 && altura > 1.20) && (veioAcompanhado == true))  {
        return console.log(true)
    } else {
        return console.log(false)
    }
}


function podeSubir(altura, veioAcompanhado) {
    if(altura > 1.40 && altura < 2) {
        console.log("Acesso Autorizado")
    } else if ((altura < 1.40 && altura > 1.20) && (veioAcompanhado == true))  {
        console.log("Acesso autorizado com acompanhante")
    } else {
        console.log("Acesso negado")
    }
}

console.log(podeSubir(1.2, false))
console.log(podeSubir(1.45, true)) 
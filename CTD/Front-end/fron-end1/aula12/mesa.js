const alicia = [23, 69, 32];
const bob = [12, 67, 43];

function encontrarGanhador(c1, c2){

    let scoreC1 = 0;
    let scoreC2 = 0;

    for (let i = 0; i < c1.length; i++){

        if (c1[i] > c2[i]) { scoreC1++}
        if (c2[i] > c1[i]) { scoreC2++}
    }
    
    if (scoreC1 > scoreC2) { return " O participante 1 ganhou!"}
    if (scoreC1 > scoreC1) { return " O participante 2 ganhou!"}
    if (scoreC1 == scoreC2) { return " Empate!"}
}
console.log(encontrarGanhador(alicia,bob));
console.log(encontrarGanhador(bob,alicia));
console.log(encontrarGanhador(alicia,alicia));

//bonificaçao kkkk

function DH(n, m) {
    for ( let i = 1; i <= 100; i++) {
        console.log(i)
        if (i%n == 0 && i%m ==0) console.log("Digital House")

        else {
            if (i%n == 0) console.log("Digital")
            if (i%m == 0) console.log("House")
        }
    }
} 
DH(2, 5);

function sumArray(umArray){
    let sum = 0;

    for ( let i = 0; i < umArray.length; i++){

        sum += umArray[i];
        
    }

    return sum;
}

console.log(sumArray([5,10,30,44]));
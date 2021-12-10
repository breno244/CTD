const aluno = require("./contrutor");
const estudantes = require("./estudantes");  
const dados = require("./estudantes"); 


console.log("---------------------------------------------")



let curso = {                 
    nomeDoCurso: "Eletricista Residencial",
    maxFaltas: 2,
    aprovacao: 8,
    listaAlunos: estudantes,
    verifica: function (aluno) {  
        if ((aluno.calcularMedia() >= this.aprovacao &&
            aluno.qtdFaltas < this.maxFaltas) || (aluno.qtdFaltas === this.maxFaltas) && (aluno.calcularMedia() >= this.aprovacao * 1.1)) {
            return aluno.nome + ' -    Aprovou ' ;
        } else 
        {
            return aluno.nome + ' -    Reprovou ';
        }
    },
    verificaTodos: function () {
        let teste = this.listaAlunos.map((item) => this.verifica(item));
        return teste;
    },
}




dados.push(new aluno("Biel Sabino", 0, [15, 10 ,7, 14]));          //Adicionar novo aluno
dados.push(new aluno("Marcos Santana", 0, [10, 11 ,17, 4]));          //Adicionar novo aluno

console.log(curso.nomeDoCurso);

console.log("---------------------------------------------")

console.log(curso.verifica(curso.listaAlunos[1]));
console.log(curso.verifica(curso.listaAlunos[6]));

console.log("---------------------------------------------")

console.log("---Lista de alunos APROVADOS/REPROVADOS---")

console.log(curso.verificaTodos());

console.log("----------------------------------------------")
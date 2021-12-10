function aluno(nome, qtdFaltas, notas) {
    this.nome = nome;
    this.notas = notas;
    this.qtdFaltas = qtdFaltas;
    this.calcularMedia = function () {
        let media = this.notas.reduce(function (acumulador, item) {
            return acumulador+item;
        },0)
        return media/this.notas.length;
    };
    this.faltas = function () {
      return this.qtdFaltas++;
    };
  };
  

  
  module.exports = aluno;
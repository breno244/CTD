package Aula1.mesa;

public class Quadrado extends Figura{

    public Quadrado(double comprimento) {
        super(comprimento);
    }
    public double calcularPerimetro(){
        return 4*getComprimento();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "comprimento=" + getComprimento() +
                ", Perimetro=" + this.calcularPerimetro() +
                '}';
    }
}

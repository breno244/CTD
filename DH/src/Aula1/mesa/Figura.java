package Aula1.mesa;

public class Figura {
    private double Comprimento;

    public Figura(double comprimento) {
        Comprimento = comprimento;
    }

    public double getComprimento() {
        return Comprimento;
    }

    public void setComprimento(double comprimento) {
        Comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "Comprimento=" + Comprimento +
                '}';
    }
}


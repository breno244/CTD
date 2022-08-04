package aula6_integradoraMesa;

public class SerieNaoHabilitadaException extends Exception{

    public SerieNaoHabilitadaException() {}

    public SerieNaoHabilitadaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

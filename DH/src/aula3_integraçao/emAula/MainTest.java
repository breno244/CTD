package aula3_integraçao.emAula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    Funcionario func1,func2;
    Afiliado afi1,afi2,afi3;

    @BeforeEach
    public void doBefore(){
        func1 = new Funcionario("Breno",2);
        func1.vender(2);

        func1 = new Funcionario("Maria",1);
        func1.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Lucas");
        afi2.vender(1);

        afi3= new Afiliado("Joseph");

        func1.addAfiliado(afi1);
    }

    @Test
    public void mostrarVendedores(){
        System.out.println(func1.mostrarCategoria);
    }
}

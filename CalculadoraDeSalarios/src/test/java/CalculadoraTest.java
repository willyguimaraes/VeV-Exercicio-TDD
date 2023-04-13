package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import main.Funcionario;

public class CalculadoraTest {
    @Test
    public void testCalculoSalarioDesenvolvedorComSalarioAcimaDe3K() {
        Funcionario ednaldo = new Funcionario("Ednaldo Pereira","EdnaldoPereira@exemplo.com", 4000.0, "DESENVOLVEDOR");
        double salarioEsperado = 3200.0; //4000 - 20%

        assertTrue(ednaldo.calcularSalario() == salarioEsperado);
    }

    @Test
    public void testCalculoSalarioDesenvolvedorComSalarioAbaixoDe3K() {
        Funcionario cornelio = new Funcionario("cornelio","cornelio@exemplo.com", 1000.0, "DESENVOLVEDOR");
        double salarioEsperado = 900.0; //1000 - 10%

        assertTrue(cornelio.calcularSalario() == salarioEsperado);
    }

    @Test
    public void testCalculoSalarioDBAComSalarioAcimaDe2K() {
        Funcionario paulinha = new Funcionario("paulinha","paulinha@exemplo.com", 10000.0, "DBA");
        double salarioEsperado = 7500.0; //10000 - 25%

        assertTrue(paulinha.calcularSalario() == salarioEsperado);
    }

    @Test
    public void testCalculoSalarioDBAComSalarioAbaixoDe2K() {
        Funcionario cornita = new Funcionario("cornita","cornita@exemplo.com", 1000.0, "DBA");
        double salarioEsperado = 850.0; // 1000 - 15%

        assertTrue(cornita.calcularSalario() ==  salarioEsperado);
    }

    @Test
    public void testCalculoSalarioTESTADORComSalarioAcimaDe2K() {
        Funcionario testeiro = new Funcionario("testeiro","testeiro@exemplo.com", 50000.0, "TESTADOR");
        double salarioEsperado = 37500.0;//50000 - 25%

        assertTrue(testeiro.calcularSalario() == salarioEsperado);
    }

    @Test
    public void testCalculoSalarioTESTADORComSalarioAbaixoDe2K() {
        Funcionario testudo = new Funcionario("testudo","testudo@exemplo.com", 500.0, "TESTADOR");
        double salarioEsperado = 425.0; //500 - 15%

        assertTrue(testudo.calcularSalario() == salarioEsperado);
    }

    @Test
    public void testCalculoSalarioGERENTEComSalarioAcimaDe5K() {
        Funcionario geral = new Funcionario("geral","geral@exemplo.com", 6000.0, "GERENTE");
        double salarioEsperado = 4200.0; //6000 - 30%

        assertTrue(geral.calcularSalario() == salarioEsperado);
    }

    @Test
    public void testCalculoSalarioGERENTEComSalarioAbaixoDe5K() {
        Funcionario assistente = new Funcionario("assistente","assistente@exemplo.com", 1500.0, "GERENTE");
        double salarioEsperado = 1200.0; //1500 - 20%

        assertTrue(assistente.calcularSalario() == salarioEsperado);
    }


}


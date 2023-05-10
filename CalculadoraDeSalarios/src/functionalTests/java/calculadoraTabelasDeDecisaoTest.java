package functionalTests.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import main.Funcionario;

public class calculadoraTabelasDeDecisaoTest{
    @Test
    public void testCalculoSalarioDesenvolvedor() {
        Funcionario dev1 = new Funcionario("dev1 Pereira","dev1Pereira@exemplo.com", 2500.0, "DESENVOLVEDOR");
        double salarioEsperado1 = Math.ceil(dev1.getSalarioBase() * 0.9); //salário x 0.9
        assertTrue(dev1.calcularSalario() == salarioEsperado1);

        Funcionario dev2 = new Funcionario("dev2 Pereira","dev2Pereira@exemplo.com", 3500.0, "DESENVOLVEDOR");
        double salarioEsperado2 = Math.ceil(dev2.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(dev2.calcularSalario() == salarioEsperado2);
    }
  
    @Test
    public void testCalculoSalarioDBA() {
        Funcionario dba1 = new Funcionario("dba1 Pereira","dba1Pereira@exemplo.com", 1500.0, "DBA");
        double salarioEsperado1 = Math.ceil(dba1.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(dba1.calcularSalario() == salarioEsperado1);

        Funcionario dba2 = new Funcionario("dba2 Pereira","dba2Pereira@exemplo.com", 2500.0, "DBA");
        double salarioEsperado2 = Math.ceil(dba2.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(dba2.calcularSalario() == salarioEsperado2);
    }

    @Test
    public void testCalculoSalariotestador() {
        Funcionario testador1 = new Funcionario("testador1 Pereira","testador1Pereira@exemplo.com", 1500.0, "TESTADOR");
        double salarioEsperado1 = Math.ceil(testador1.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(testador1.calcularSalario() == salarioEsperado1);

        Funcionario testador2 = new Funcionario("testador2 Pereira","testador2Pereira@exemplo.com", 2500.0, "TESTADOR");
        double salarioEsperado2 = Math.ceil(testador2.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(testador2.calcularSalario() == salarioEsperado2);
    }

    @Test
    public void testCalculoSalarioGerente() {
        Funcionario gerente1 = new Funcionario("gerente1 Pereira","gerente1Pereira@exemplo.com", 4000.0, "GERENTE");
        double salarioEsperado1 = Math.ceil(gerente1.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(gerente1.calcularSalario() == salarioEsperado1);

        Funcionario gerente2 = new Funcionario("gerente2 Pereira","gerente2Pereira@exemplo.com", 6000.0, "GERENTE");
        double salarioEsperado2 = Math.ceil(gerente2.getSalarioBase() * 0.7); //salário x 0.7
        assertTrue(gerente2.calcularSalario() == salarioEsperado2);
    }

}
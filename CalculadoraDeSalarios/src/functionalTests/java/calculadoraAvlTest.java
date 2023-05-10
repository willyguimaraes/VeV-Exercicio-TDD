package functionalTests.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import main.Funcionario;

public class calculadoraAvlTest{
    @Test
    public void testCalculoSalarioDesenvolvedor() {
        Funcionario dev1 = new Funcionario("dev1 Pereira","dev1Pereira@exemplo.com", 2900.0, "DESENVOLVEDOR");
        double salarioEsperado1 = Math.ceil(dev1.getSalarioBase() * 0.9); //salário x 0.9
        assertTrue(dev1.calcularSalario() == salarioEsperado1);

        Funcionario dev2 = new Funcionario("dev2 Pereira","dev2Pereira@exemplo.com", 2998.0, "DESENVOLVEDOR");
        double salarioEsperado2 = Math.ceil(dev2.getSalarioBase() * 0.9); //salário x 0.9
        assertTrue(dev2.calcularSalario() == salarioEsperado2);

        Funcionario dev3 = new Funcionario("dev3 Pereira","dev3Pereira@exemplo.com", 2999.0, "DESENVOLVEDOR");
        double salarioEsperado3 = Math.ceil(dev3.getSalarioBase() * 0.9); //salário x 0.9
        assertTrue(dev3.calcularSalario() == salarioEsperado3);

        Funcionario dev4 = new Funcionario("dev4 Pereira","dev4Pereira@exemplo.com", 3000.0, "DESENVOLVEDOR");
        double salarioEsperado4 = Math.ceil(dev4.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(dev4.calcularSalario() == salarioEsperado4);

        Funcionario dev5 = new Funcionario("dev5 Pereira","dev5Pereira@exemplo.com", 3001.0, "DESENVOLVEDOR");
        double salarioEsperado5 = Math.ceil(dev5.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(dev5.calcularSalario() == salarioEsperado5);

        Funcionario dev6 = new Funcionario("dev6 Pereira","dev6Pereira@exemplo.com", 3333.0, "DESENVOLVEDOR");
        double salarioEsperado6 = Math.ceil(dev6.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(dev6.calcularSalario() == salarioEsperado6);
    }
  
    @Test
    public void testCalculoSalarioDBA() {
        Funcionario dba1 = new Funcionario("dba1 Pereira","dba1Pereira@exemplo.com", 1900.0, "DBA");
        double salarioEsperado1 = Math.ceil(dba1.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(dba1.calcularSalario() == salarioEsperado1);

        Funcionario dba2 = new Funcionario("dba2 Pereira","dba2Pereira@exemplo.com", 1998.0, "DBA");
        double salarioEsperado2 = Math.ceil(dba2.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(dba2.calcularSalario() == salarioEsperado2);

        Funcionario dba3 = new Funcionario("dba3 Pereira","dba3Pereira@exemplo.com", 1999.0, "DBA");
        double salarioEsperado3 = Math.ceil(dba3.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(dba3.calcularSalario() == salarioEsperado3);

        Funcionario dba4 = new Funcionario("dba4 Pereira","dba4Pereira@exemplo.com", 2000.0, "DBA");
        double salarioEsperado4 = Math.ceil(dba4.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(dba4.calcularSalario() == salarioEsperado4);

        Funcionario dba5 = new Funcionario("dba5 Pereira","dba5Pereira@exemplo.com", 2001.0, "DBA");
        double salarioEsperado5 = Math.ceil(dba5.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(dba5.calcularSalario() == salarioEsperado5);

        Funcionario dba6 = new Funcionario("dba6 Pereira","dba6Pereira@exemplo.com", 2333.0, "DBA");
        double salarioEsperado6 = Math.ceil(dba6.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(dba6.calcularSalario() == salarioEsperado6);
    }

    @Test
    public void testCalculoSalariotestador() {
        Funcionario testador1 = new Funcionario("testador1 Pereira","testador1Pereira@exemplo.com", 1900.0, "TESTADOR");
        double salarioEsperado1 = Math.ceil(testador1.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(testador1.calcularSalario() == salarioEsperado1);

        Funcionario testador2 = new Funcionario("testador2 Pereira","testador2Pereira@exemplo.com", 1998.0, "TESTADOR");
        double salarioEsperado2 = Math.ceil(testador2.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(testador2.calcularSalario() == salarioEsperado2);

        Funcionario testador3 = new Funcionario("testador3 Pereira","testador3Pereira@exemplo.com", 1999.0, "TESTADOR");
        double salarioEsperado3 = Math.ceil(testador3.getSalarioBase() * 0.85); //salário x 0.85
        assertTrue(testador3.calcularSalario() == salarioEsperado3);

        Funcionario testador4 = new Funcionario("testador4 Pereira","testador4Pereira@exemplo.com", 2000.0, "TESTADOR");
        double salarioEsperado4 = Math.ceil(testador4.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(testador4.calcularSalario() == salarioEsperado4);

        Funcionario testador5 = new Funcionario("testador5 Pereira","testador5Pereira@exemplo.com", 2001.0, "TESTADOR");
        double salarioEsperado5 = Math.ceil(testador5.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(testador5.calcularSalario() == salarioEsperado5);

        Funcionario testador6 = new Funcionario("testador6 Pereira","testador6Pereira@exemplo.com", 2333.0, "TESTADOR");
        double salarioEsperado6 = Math.ceil(testador6.getSalarioBase() * 0.75); //salário x 0.75
        assertTrue(testador6.calcularSalario() == salarioEsperado6);
    }

    @Test
    public void testCalculoSalarioGerente() {
        Funcionario gerente1 = new Funcionario("gerente1 Pereira","gerente1Pereira@exemplo.com", 4900.0, "GERENTE");
        double salarioEsperado1 = Math.ceil(gerente1.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(gerente1.calcularSalario() == salarioEsperado1);

        Funcionario gerente2 = new Funcionario("gerente2 Pereira","gerente2Pereira@exemplo.com", 4998.0, "GERENTE");
        double salarioEsperado2 = Math.ceil(gerente2.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(gerente2.calcularSalario() == salarioEsperado2);

        Funcionario gerente3 = new Funcionario("gerente3 Pereira","gerente3Pereira@exemplo.com", 4999.0, "GERENTE");
        double salarioEsperado3 = Math.ceil(gerente3.getSalarioBase() * 0.8); //salário x 0.8
        assertTrue(gerente3.calcularSalario() == salarioEsperado3);

        Funcionario gerente4 = new Funcionario("gerente4 Pereira","gerente4Pereira@exemplo.com", 5000.0, "GERENTE");
        double salarioEsperado4 = Math.ceil(gerente4.getSalarioBase() * 0.7); //salário x 0.7
        assertTrue(gerente4.calcularSalario() == salarioEsperado4);

        Funcionario gerente5 = new Funcionario("gerente5 Pereira","gerente5Pereira@exemplo.com", 5001.0, "GERENTE");
        double salarioEsperado5 = Math.ceil(gerente5.getSalarioBase() * 0.7); //salário x 0.7
        assertTrue(gerente5.calcularSalario() == salarioEsperado5);

        Funcionario gerente6 = new Funcionario("gerente6 Pereira","gerente6Pereira@exemplo.com", 5333.0, "GERENTE");
        double salarioEsperado6 = Math.ceil(gerente6.getSalarioBase() * 0.7); //salário x 0.7
        assertTrue(gerente6.calcularSalario() == salarioEsperado6);
    }

}
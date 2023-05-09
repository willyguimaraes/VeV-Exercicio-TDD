package functionalTests.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Fatura;
import main.GeradorNotaFiscal;
import main.NotaFiscal;

public class geradorNotaFiscalTabelasDeDecisaoTest {

    private GeradorNotaFiscal geradorNF;

    @Before
    public void createEnviroment(){

        geradorNF = new GeradorNotaFiscal();
    }

    @Test
    public void testGeradorNotaFiscalCONSULTORIA() {
        int impostoEsperado = 25; //Em porcentagem.

        //caso onde o valor da fatura é menor ou igual a 0
        Fatura fatura1 = new Fatura("José", "Rua 10", "CONSULTORIA", 0.00);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);
        });
    
        String expectedMessage = "Valor de fatura invalido";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
        

        //caso onde o valor da fatura é maior que 0
        Fatura fatura2 = new Fatura("José", "Rua 10", "CONSULTORIA", 1000.00);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());
    }

    @Test
    public void testGeradorNotaFiscalTREINAMENTO() {
        int impostoEsperado = 15; //Em porcentagem.

        //caso onde o valor da fatura é menor ou igual a 0
        Fatura fatura1 = new Fatura("José", "Rua 10", "TREINAMENTO", 0.00);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);
        });
    
        String expectedMessage = "Valor de fatura invalido";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));


        //caso onde o valor da fatura é maior que 0
        Fatura fatura2 = new Fatura("José", "Rua 10", "TREINAMENTO", 100.00);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());
    }

    @Test
    public void testGeradorNotaFiscalOUTRO() {
        int impostoEsperado = 6; //Em porcentagem.

        //caso onde o valor da fatura é menor ou igual a 0
        Fatura fatura1 = new Fatura("José", "Rua 10", "OUTRO", 0.00);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);
        });
    
        String expectedMessage = "Valor de fatura invalido";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));

        //caso onde o valor da fatura é maior que 0
        Fatura fatura2 = new Fatura("José", "Rua 10", "OUTRO", 100.00);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());
    }


}

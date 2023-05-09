package functionalTests.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Fatura;
import main.GeradorNotaFiscal;
import main.NotaFiscal;

public class geradorNotaFiscalPPETest {
  
    private GeradorNotaFiscal geradorNF;

    @Before
    public void createEnviroment(){

        geradorNF = new GeradorNotaFiscal();
    }

    @Test
    public void testGeradorNotaFiscalFaturasValidas() {

        // Fatura de consultoria 
        int impostoEsperado1 = 25; //Em porcentagem.

        Fatura fatura1 = new Fatura("José", "Rua 10", "CONSULTORIA", 1000.00);
        NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);

        assertEquals(impostoEsperado1, nf1.getImposto());
        assertTrue(fatura1.getValor() == nf1.getValor());
        assertEquals(fatura1.getNome(), nf1.getNome());

        //Fatura de treinamento
        int impostoEsperado2 = 15; //Em porcentagem.

        Fatura fatura2 = new Fatura("José", "Rua 10", "TREINAMENTO", 1000.00);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado2, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());

        //Fatura de outro tipo de serviço
        int impostoEsperado3 = 6; //Em porcentagem.

        Fatura fatura3 = new Fatura("José", "Rua 10", "VENDA", 100.00);
        NotaFiscal nf3 = geradorNF.geradorNotaFiscal(fatura3);

        assertEquals(impostoEsperado3, nf3.getImposto());
        assertTrue(fatura3.getValor() == nf3.getValor());
        assertEquals(fatura3.getNome(), nf3.getNome());

    }

    @Test
    public void testGeradorNotaFiscalFaturasInvalidas() {
        // faturas com valor = 0
        // Fatura de consultoria com valor = 0

        Fatura fatura1 = new Fatura("José", "Rua 10", "CONSULTORIA", 0.00);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);
        });
    
        String expectedMessage = "Valor de fatura invalido";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));

        //Fatura de treinamento com valor = 0

        Fatura fatura2 = new Fatura("José", "Rua 10", "TREINAMENTO", 0.00);
        Exception exception2 = assertThrows(RuntimeException.class, () -> {
            NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);
        });
    
        String expectedMessage2 = "Valor de fatura invalido";
        String actualMessage2 = exception2.getMessage();
    
        assertTrue(actualMessage2.contains(expectedMessage2));

        //Fatura de outro tipo de serviço com valor = 0
        Fatura fatura3 = new Fatura("José", "Rua 10", "TESTE", 0.00);
        Exception exception3 = assertThrows(RuntimeException.class, () -> {
            NotaFiscal nf3 = geradorNF.geradorNotaFiscal(fatura3);
        });
    
        String expectedMessage3 = "Valor de fatura invalido";
        String actualMessage3 = exception3.getMessage();
    
        assertTrue(actualMessage3.contains(expectedMessage3));

        //Fatura com nome vazio
        Exception exception4 = assertThrows(RuntimeException.class, () -> {
            Fatura fatura4 = new Fatura("", "Rua 10", "TESTE", 1000.00);

        });
    
        String expectedMessage4 = "Nome ou endereco não podem ser vazios";
        String actualMessage4 = exception4.getMessage();
    
        assertTrue(actualMessage4.contains(expectedMessage4));

        

        //Fatura com endereco vazio
        Exception exception5 = assertThrows(RuntimeException.class, () -> {
            Fatura fatura5 = new Fatura("josé", "", "TESTE", 1000.00);

        });
    
        String expectedMessage5 = "Nome ou endereco não podem ser vazios";
        String actualMessage5 = exception5.getMessage();
    
        assertTrue(actualMessage5.contains(expectedMessage5));

    }
}

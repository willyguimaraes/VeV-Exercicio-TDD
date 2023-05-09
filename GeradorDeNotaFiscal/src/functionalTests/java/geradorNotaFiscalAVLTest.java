package functionalTests.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Fatura;
import main.GeradorNotaFiscal;
import main.NotaFiscal;


public class geradorNotaFiscalAVLTest {

    private GeradorNotaFiscal geradorNF;

    @Before
    public void createEnviroment(){
        geradorNF = new GeradorNotaFiscal();
    }

    @Test
    public void testGeradorNotaFiscalCONSULTORIA() {
        int impostoEsperado = 25; //Em porcentagem.

        //caso de valor minimo (A = 0,01)
        Fatura fatura1 = new Fatura("José", "Rua 10", "CONSULTORIA", 0.01);
        NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);

        assertEquals(impostoEsperado, nf1.getImposto());
        assertTrue(fatura1.getValor() == nf1.getValor());
        assertEquals(fatura1.getNome(), nf1.getNome());


        //caso de valor minimo + 1 (A + 1 = 1,01)
        Fatura fatura2 = new Fatura("José", "Rua 10", "CONSULTORIA", 1.01);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());


        //caso de valor aleatorio(R = 590)
        Fatura fatura3 = new Fatura("José", "Rua 10", "CONSULTORIA", 590.00);
        NotaFiscal nf3 = geradorNF.geradorNotaFiscal(fatura3);

        assertEquals(impostoEsperado, nf3.getImposto());
        assertTrue(fatura3.getValor() == nf3.getValor());
        assertEquals(fatura3.getNome(), nf3.getNome());


        //caso de valor maximo (B = 1000000)
        Fatura fatura4 = new Fatura("José", "Rua 10", "CONSULTORIA", 1000000.00);
        NotaFiscal nf4 = geradorNF.geradorNotaFiscal(fatura4);

        assertEquals(impostoEsperado, nf4.getImposto());
        assertTrue(fatura4.getValor() == nf4.getValor());
        assertEquals(fatura4.getNome(), nf4.getNome());



        //caso de valor maximo - 1 (B - 1 = 999999)
        Fatura fatura5 = new Fatura("José", "Rua 10", "CONSULTORIA", 999999.00);
        NotaFiscal nf5 = geradorNF.geradorNotaFiscal(fatura5);

        assertEquals(impostoEsperado, nf5.getImposto());
        assertTrue(fatura5.getValor() == nf5.getValor());
        assertEquals(fatura5.getNome(), nf5.getNome());

    }

    @Test
    public void testGeradorNotaFiscalTREINAMENTO() {
        int impostoEsperado = 15; //Em porcentagem.

        //caso de valor minimo (A = 0,01)
        Fatura fatura1 = new Fatura("José", "Rua 10", "TREINAMENTO", 0.01);
        NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);

        assertEquals(impostoEsperado, nf1.getImposto());
        assertTrue(fatura1.getValor() == nf1.getValor());
        assertEquals(fatura1.getNome(), nf1.getNome());


        //caso de valor minimo + 1 (A + 1 = 1,01)
        Fatura fatura2 = new Fatura("José", "Rua 10", "TREINAMENTO", 1.01);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());


        //caso de valor aleatorio(R = 345)
        Fatura fatura3 = new Fatura("José", "Rua 10", "TREINAMENTO", 345.00);
        NotaFiscal nf3 = geradorNF.geradorNotaFiscal(fatura3);

        assertEquals(impostoEsperado, nf3.getImposto());
        assertTrue(fatura3.getValor() == nf3.getValor());
        assertEquals(fatura3.getNome(), nf3.getNome());


        //caso de valor maximo (B = 1000000)
        Fatura fatura4 = new Fatura("José", "Rua 10", "TREINAMENTO", 1000000.00);
        NotaFiscal nf4 = geradorNF.geradorNotaFiscal(fatura4);

        assertEquals(impostoEsperado, nf4.getImposto());
        assertTrue(fatura4.getValor() == nf4.getValor());
        assertEquals(fatura4.getNome(), nf4.getNome());



        //caso de valor maximo - 1 (B - 1 = 999999)
        Fatura fatura5 = new Fatura("José", "Rua 10", "TREINAMENTO", 999999.00);
        NotaFiscal nf5 = geradorNF.geradorNotaFiscal(fatura5);

        assertEquals(impostoEsperado, nf5.getImposto());
        assertTrue(fatura5.getValor() == nf5.getValor());
        assertEquals(fatura5.getNome(), nf5.getNome());

    }

    @Test
    public void testGeradorNotaFiscalOUTRO() {
        int impostoEsperado = 6; //Em porcentagem.

        //caso de valor minimo (A = 0,01)
        Fatura fatura1 = new Fatura("José", "Rua 10", "OUTRO", 0.01);
        NotaFiscal nf1 = geradorNF.geradorNotaFiscal(fatura1);

        assertEquals(impostoEsperado, nf1.getImposto());
        assertTrue(fatura1.getValor() == nf1.getValor());
        assertEquals(fatura1.getNome(), nf1.getNome());


        //caso de valor minimo + 1 (A + 1 = 1,01)
        Fatura fatura2 = new Fatura("José", "Rua 10", "OUTRO", 1.01);
        NotaFiscal nf2 = geradorNF.geradorNotaFiscal(fatura2);

        assertEquals(impostoEsperado, nf2.getImposto());
        assertTrue(fatura2.getValor() == nf2.getValor());
        assertEquals(fatura2.getNome(), nf2.getNome());


        //caso de valor aleatorio(R = 1025)
        Fatura fatura3 = new Fatura("José", "Rua 10", "OUTRO", 1025.00);
        NotaFiscal nf3 = geradorNF.geradorNotaFiscal(fatura3);

        assertEquals(impostoEsperado, nf3.getImposto());
        assertTrue(fatura3.getValor() == nf3.getValor());
        assertEquals(fatura3.getNome(), nf3.getNome());


        //caso de valor maximo (B = 1000000)
        Fatura fatura4 = new Fatura("José", "Rua 10", "OUTRO", 1000000.00);
        NotaFiscal nf4 = geradorNF.geradorNotaFiscal(fatura4);

        assertEquals(impostoEsperado, nf4.getImposto());
        assertTrue(fatura4.getValor() == nf4.getValor());
        assertEquals(fatura4.getNome(), nf4.getNome());



        //caso de valor maximo - 1 (B - 1 = 999999)
        Fatura fatura5 = new Fatura("José", "Rua 10", "OUTRO", 999999.00);
        NotaFiscal nf5 = geradorNF.geradorNotaFiscal(fatura5);

        assertEquals(impostoEsperado, nf5.getImposto());
        assertTrue(fatura5.getValor() == nf5.getValor());
        assertEquals(fatura5.getNome(), nf5.getNome());

    }

    
}

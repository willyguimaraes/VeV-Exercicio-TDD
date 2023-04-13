package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Fatura;
import main.GeradorNotaFiscal;
import main.NotaFiscal;
import main.NotaFiscalDao;
import main.SAP;
import main.Smtp;

public class GeradorNotaFiscalTest {

    private NotaFiscalDao dao;
    private SAP sap;
    private Smtp smtp;
    private GeradorNotaFiscal geradorNF;

    @Before
    public void createEnviroment(){
        dao = new NotaFiscalDao();
        sap = new SAP();
        smtp = new Smtp();
        geradorNF = new GeradorNotaFiscal();
    }

    @Test
    public void testGeradorNotaFiscal25() {
        int impostoEsperado = 25; //Em porcentagem.

        Fatura fatura = new Fatura("José", "Rua 10", "CONSULTORIA", 100.00);
        NotaFiscal nf = geradorNF.geradorNotaFiscal(fatura);

        assertEquals(impostoEsperado, nf.getImposto());
        assertTrue(fatura.getValor() == nf.getValor());
        assertEquals(fatura.getNome(), nf.getNome());
    }

    @Test
    public void testGeradorNotaFiscal15() {
        int impostoEsperado = 15; //Em porcentagem.

        Fatura fatura = new Fatura("José", "Rua 10", "TREINAMENTO", 100.00);
        NotaFiscal nf = geradorNF.geradorNotaFiscal(fatura);

        assertEquals(impostoEsperado, nf.getImposto());
        assertTrue(fatura.getValor() == nf.getValor());
        assertEquals(fatura.getNome(), nf.getNome());
    }

    @Test
    public void testGeradorNotaFiscal6() {
        int impostoEsperado = 6; //Em porcentagem.

        Fatura fatura = new Fatura("José", "Rua 10", "VENDA", 100.00);
        NotaFiscal nf = geradorNF.geradorNotaFiscal(fatura);

        assertEquals(impostoEsperado, nf.getImposto());
        assertTrue(fatura.getValor() == nf.getValor());
        assertEquals(fatura.getNome(), nf.getNome());
    }

    @Test
    public void testSaida(){
        Fatura fatura = new Fatura("José", "Rua 10", "VENDA", 100.00);
        NotaFiscal nf = geradorNF.geradorNotaFiscal(fatura);

        assertEquals("salvando no banco", this.dao.salva(nf));
        assertEquals("enviando pro sap", this.sap.envia(nf));
        assertEquals("enviando por email", this.smtp.envia(nf));
    }
}

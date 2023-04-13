package test.java;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeradorNotaFiscal {

    @Before
    private void createEnviroment(){
        NotaFiscalDao dao = new NotaFiscalDao();
        SAP sap = new SAP();
        Smtp smtp = new Smtp();
    }

    @Test
    public void testGeradorNotaFiscal25() {
        int impostoEsperado = 25; //Em porcentagem.

        Fatura fatura = new Fatura("José", "Rua 10", "CONSULTORIA", 100,00);
        NotaFiscal nf = geradorNotaFiscal(fatura);

        assertEquals(impostoEsperado, nf.getImposto());
        assertEquals(fatura.getValor(), nf.getValor());
        assertEquals(fatura.getNome(), nf.getNome());
    }

    @Test
    public void testGeradorNotaFiscal15() {
        int impostoEsperado = 15; //Em porcentagem.

        Fatura fatura = new Fatura("José", "Rua 10", "TREINAMENTO", 100,00);
        NotaFiscal nf = geradorNotaFiscal(fatura);

        assertEquals(impostoEsperado, nf.getImposto());
        assertEquals(fatura.getValor(), nf.getValor());
        assertEquals(fatura.getNome(), nf.getNome());
    }

    @Test
    public void testGeradorNotaFiscal6() {
        int impostoEsperado = 6; //Em porcentagem.

        Fatura fatura = new Fatura("José", "Rua 10", "VENDA", 100,00);
        NotaFiscal nf = geradorNotaFiscal(fatura);

        assertEquals(impostoEsperado, nf.getImposto());
        assertEquals(fatura.getValor(), nf.getValor());
        assertEquals(fatura.getNome(), nf.getNome());
    }

    @Test
    public void testSaida(){
        Fatura fatura = new Fatura("José", "Rua 10", "VENDA", 100,00);
        NotaFiscal nf = geradorNotaFiscal(fatura);

        assertEquals("salvando no banco", dao.salvar(nf));
        assertEquals("enviando pro sap", sap.envia(nf));
        assertEquals("enviando por emai", smtp.envia(nf));
    }
}

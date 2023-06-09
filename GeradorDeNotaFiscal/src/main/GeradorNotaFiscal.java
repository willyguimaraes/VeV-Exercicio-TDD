package main;

public class GeradorNotaFiscal {

    private NotaFiscalDao dao = new NotaFiscalDao();
    private SAP sap = new SAP();
    private Smtp smtp = new Smtp();
    
    public NotaFiscal geradorNotaFiscal(Fatura fatura) {

        NotaFiscal nf = new NotaFiscal();

        nf.setNome(fatura.getNome());
        nf.setValor(fatura.getValor());

        switch(fatura.getTipoServico()){
            case("CONSULTORIA"):
                nf.setImposto(25);
                break;
            case("TREINAMENTO"):
                nf.setImposto(15);
                break;
            default:
                nf.setImposto(6);
                break;
        }

        this.dao.salva(nf);
        this.sap.envia(nf);
        this.smtp.envia(nf);

        return nf;
    }
}

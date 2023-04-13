package main;

public class NotaFiscal {

    private String nome;
    private double valor;
    private int imposto;

    public NotaFiscal() {
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getImposto() {
        return imposto;
    }
    public void setImposto(int imposto) {
        this.imposto = imposto;
    }
}

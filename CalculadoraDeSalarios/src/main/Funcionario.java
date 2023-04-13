package main;

public class Funcionario {

    private String nome;
    private String email;
    private double salarioBase;
    private String cargo;

    public Funcionario(String nome, String email, double salarioBase, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }
    //Determina o valor do desconto e retorna o valor liquido
    public double calcularSalario() {
        
        double fatorDeDesconto = 0;
        double liquido;

        switch (this.cargo) {
            case "DESENVOLVEDOR":
                if(this.salarioBase >= 3000.0){
                    fatorDeDesconto = 0.20;
                }else{
                    fatorDeDesconto = 0.10;
                }
                break;
            case "DBA":
                if(this.salarioBase >= 2000.0){
                    fatorDeDesconto = 0.25;
                }else{
                    fatorDeDesconto = 0.15;
                }
                break;
            case "TESTADOR":
                if(this.salarioBase >= 2000.0){
                    fatorDeDesconto = 0.25;
                }else{
                    fatorDeDesconto = 0.15;
                }
                break;
            case "GERENTE":
                if(this.salarioBase >= 5000.0){
                    fatorDeDesconto = 0.30;
                }else{
                    fatorDeDesconto = 0.20;
                }
                break;

        
            default:
                break;
        }
        liquido = calcularLiquido(fatorDeDesconto);
        return liquido;
    }

    //calcula o valor liquido do salario do funcionario
    public double calcularLiquido(double fatorDeDesconto){
       double valorDescontado = this.salarioBase * fatorDeDesconto;
        return this.salarioBase - valorDescontado; //valor liquido
    }

    

}

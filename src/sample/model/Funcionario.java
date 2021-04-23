package sample.model;

/** Classes */

public class Funcionario extends Pessoa {
    private String funcao;
    private double salario;

    public Funcionario() {
    }

    /** Getter e Setter */

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double valorHora, double qtdeHora) {
        this.salario = valorHora * qtdeHora;
    }

    /** ToString */

    public String toString() {
        return super.toString() + "\n"
                + "Função: " + funcao
                + "Salário: " + salario;
    }

}



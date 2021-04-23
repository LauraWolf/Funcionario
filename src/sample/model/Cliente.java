package sample.model;

/** Classes */

public class Cliente extends Pessoa{
    private String dataCadastro;

    /** Getter e Setter */

    public Cliente(String nome, String sobrenome){
        super(nome, sobrenome);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String toString(){
        return super.toString() +
                "\nData de Cadastro: " + dataCadastro;
    }
}
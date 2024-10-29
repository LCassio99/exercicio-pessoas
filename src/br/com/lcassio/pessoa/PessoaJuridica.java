package br.com.lcassio.pessoa;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
    }
}

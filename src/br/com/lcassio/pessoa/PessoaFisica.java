package br.com.lcassio.pessoa;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
    }
}

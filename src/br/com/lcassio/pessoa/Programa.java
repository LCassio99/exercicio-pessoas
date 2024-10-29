package br.com.lcassio.pessoa;

public class Programa {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Luciano Cássio", "123.456.789-45");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Code Tech", "55.836.326/0001-45");

        pessoaFisica.mostrarInfo();
        System.out.println("-----------------------------------------------");
        pessoaJuridica.mostrarInfo();
    }
}

package br.treinamento;

public class PessoaFisica extends Pessoa {

    private String cpf;

    private String modeloContratacao ="CLT";

    public String getModeloContratacao() {
        return modeloContratacao;
    }

    public void setModeloContratacao(String modeloContratacao) {
        this.modeloContratacao = modeloContratacao;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

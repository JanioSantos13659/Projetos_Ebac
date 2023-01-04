package br.treinamento;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    private String modeloContratacao ="PJ";

    public String getModeloContratacao() {
        return modeloContratacao;
    }

    public void setModelo(String modeloContratacao) {
        this.modeloContratacao = modeloContratacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}

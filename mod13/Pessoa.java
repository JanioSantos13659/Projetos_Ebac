package br.treinamento;

import java.util.Date;

public  abstract class Pessoa {


    private Long codigo;
    private String nome;
    private String endereço;
    private Date dataNascimento;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String modeloPj(PessoaJuridica pessoaJuridica){
        return pessoaJuridica.getModeloContratacao();
    }

    public String modeloCLT(PessoaFisica pessoaFisica){
        return pessoaFisica.getModeloContratacao();
    }

}

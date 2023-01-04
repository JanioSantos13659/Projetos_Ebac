package br.treinamento;

import java.util.*;

public class Programa {
    public static void main(String[] args) {

        /**
         * Tarefa parte 1 - Criando clase abstrata com superclasse e subclasses
         */
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("******************* Pessoa Fisica ****************");
        System.out.println("==================================================");
        System.out.println("==================================================");

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCodigo(1l);
        pessoaFisica.setEndereço("Rua nova aliança");
        pessoaFisica.setNome("Jonas Oliveira");
        pessoaFisica.setDataNascimento(new Date(12-02-1981));
        pessoaFisica.setCpf("123.256.789.12");

        System.out.println("Nome Pessoa Fisica: " + pessoaFisica.getNome());
        System.out.println("CPF pessoa Fisica: " + pessoaFisica.getCpf());
        System.out.println("Modelo de contratação: " + pessoaFisica.modeloCLT(pessoaFisica));

        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("******** Pessoa Juridica *******************");
        System.out.println("==================================================");
        System.out.println("==================================================");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCodigo(2l);
        pessoaJuridica.setEndereço("Rua nova aliança");
        pessoaJuridica.setNome("Felipe Lima");
        pessoaJuridica.setDataNascimento(new Date(10-07-2001));
        pessoaJuridica.setCnpj("54.395.001/0001-01");

        System.out.println("Nome pessoa Juridica: " + pessoaJuridica.getNome());
        System.out.println("CNPJ pessoa Juridica: " + pessoaJuridica.getCnpj());
        System.out.println("Modelo de contrtação: " + pessoaJuridica.modeloPj(pessoaJuridica));

    }
}

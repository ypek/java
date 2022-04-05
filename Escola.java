/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g1;

public class Escola {

    public String nome;
    public String endereco;
    public int telefone;
    public String cnpj;
    public double rendaMensal;
    public int QtdMatriculado;

    public void addRenda(){
        rendaMensal = rendaMensal + 100; // 100 = valor da aula
    }
    public void removeRenda(){
        rendaMensal = rendaMensal - 100;
    }
    public void matricularAluno(){
        QtdMatriculado++;
    }
    public void dadosEscolas(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Renda Mensal: " + rendaMensal);
    }


}


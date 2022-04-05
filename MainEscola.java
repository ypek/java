/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g1;

/**
 *
 * @author ypekg
 */
public class MainEscola{
     public static void main(String[] args){
        Escola escola = new Escola();
        escola.nome = "Escola de Programação";
        escola.endereco = "Rua Onde Judas Perdeu as Botas, 0";
        escola.telefone = 123456789;
        escola.cnpj = "00.000.000/0000-00";
        escola.rendaMensal = 0;

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 18;
        aluno.telefone = 123456789;
        aluno.matriculado = false;

        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 30;
        professor.telefone = 987654321;
        professor.materia = "Programação";

        escola.dadosEscolas();
        System.out.println("");
        aluno.dadosAlunos();
        System.out.println("");
        professor.dadosProfessor();
    }

}

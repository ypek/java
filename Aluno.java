/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g1;

/**
 *
 * @author ypekg
 */
public class Aluno {
    public String nome;
    public int idade;
    public int telefone;
    public String materia;
    public boolean matriculado;

    public void dadosAlunos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
        System.out.println("Materia: " + materia);
    }

    public void matricularAluno(){
        if(matriculado == false){
            matriculado = true;
            System.out.println("O aluno foi matriculado");
        }else{
            System.out.println("O aluno já está matriculado");
        }
    }

}

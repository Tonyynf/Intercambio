/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intercambio;

/**
 *
 * @author tonye
 */
public class Estudante {
    private String nome;
    private int ano_nasc;
    private int matricula;
    private int ano_de_inscricao;
    private boolean apto;

    public Estudante(String nome, int ano_nasc, int matricula, int ano_de_inscricao){
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.matricula = matricula;
        this.ano_de_inscricao = ano_de_inscricao;
    }
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Nascimento: " + this.ano_nasc);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Ano de inscrição:" + this.ano_de_inscricao);
        
        if(this.ano_nasc > 2004 && this.ano_de_inscricao > 2020 && this.ano_de_inscricao < 2012){
             System.out.println("Você não está apto para viajar, " + this.nome);
        }else{
            System.out.println("\nBoa Viagem! " + this.nome);
        }
    }
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno_de_inscricao() {
        return ano_de_inscricao;
    }

    public void setAno_de_inscricao(int ano_de_inscricao) {
        this.ano_de_inscricao = ano_de_inscricao;
    }
    
    
    
}

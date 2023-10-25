/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2510;

/**
 *
 * @author alunodev07
 */
public class Produto {
    public String nome;
    public double preco;
    
    public Produto(String nome, double preco){
    this.nome = nome; 
    this.preco= preco;
    }
    
    boolean ehcaro(){
        return (preco>100);}
        
        String getnome(){
    return nome;
    }
        double getpreco(){
            return preco;
        }
        
        void setnome(String n){
            this.nome= n;
        }
        void setpreco(double p){
        this.preco=p;
        }
    
}

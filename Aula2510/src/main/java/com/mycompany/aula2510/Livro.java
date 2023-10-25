/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2510;

/**
 *
 * @author alunodev07
 */
public class Livro extends Produto{
    public String autor;
    public int paginas;
    
    Livro(String a, int pag, String nome, double preco){
    super(nome,preco);    
    this.autor = a;
    this.paginas=pag;
    }
    boolean ehGrande(){
        return (paginas>100);
    }
    
    String getautor(){
    return autor;
    }
    
    int getpaginas(){
    return paginas;
    }
    
    void setautor(String a){
    this.autor=a;
    }
    
    void setpaginas(int i){
    this.paginas=i;
    }
}

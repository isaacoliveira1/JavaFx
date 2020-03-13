/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.JTextField;

/**
 *
 * @author Desenvolvimento
 */
public class JIFPrivate extends JFCadastro {
   private int codigo;
   private String nome;
   private String cpf;
   private String cidade;
   private String uf;

   public JIFPrivate(){
      super();
   }
//   public JIFPrivate(int codigo, String nome, String cpf, String cidade, String uf){
//      super();
//      this.codigo = codigo;
//      this.nome = nome;
//      this.cpf = cpf;
//      this.cidade = cidade;
//      this.uf = uf;
//   }
   public int getCodigo(){
      return codigo;
   }
   public void setCodigo(int codigo){
      this.codigo = codigo;
   }

   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }

   public String getCPF(){
      return cpf;
   }
   public void setCPF(String cpf){
      this.cpf = cpf;
   }

   public String getCidade(){
      return cidade;
   }
   public void setCidade(String cidade){
      this.cidade = cidade;
   }

   public String getUF(){
      return uf;
   }
   public void setUF(String uf){
      this.uf = uf;
   }

   @Override
   public String toString(){
      return "Codigo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nCidade: " + cidade + "\nUF: " + uf;
   }

}

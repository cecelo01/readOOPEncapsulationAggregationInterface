/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readoopencapsulationaggregationinterface;

/**
 *
 * @author Marce
 */
public class Pessoa {
    
    private int idade;
    private String nome, sexo;
    
    public Pessoa(int id, String no, String se){
        this.idade = id;
        this.nome = no;
        this.sexo = se;
    }
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Parabens a idade atual e: "+this.getIdade());
    }
    
    public void setIdade (int idade){
        this.idade = idade;
    }
    public int getIdade (){
        return this.idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }
}

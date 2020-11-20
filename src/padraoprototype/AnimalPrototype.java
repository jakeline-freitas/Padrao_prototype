/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoprototype;

/**
 *
 * @author Jake Freitas
 */
public abstract class AnimalPrototype {
    protected String raca;
    protected String nome;
    protected String idade;
   
    
    public abstract AnimalPrototype clonar();
    public abstract String exibirInfo();


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    
    

  
    
    
}

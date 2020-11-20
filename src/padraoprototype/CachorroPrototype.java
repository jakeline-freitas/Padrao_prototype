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
public class CachorroPrototype extends AnimalPrototype{

    protected CachorroPrototype(CachorroPrototype c) {
        this.raca = c.getRaca();
        this.nome = c.getNome();
        this.idade = c.getIdade();
    }
    public CachorroPrototype(){
        raca = "";
        nome = "";
        idade = "";
    }
    
       

    @Override
    public AnimalPrototype clonar() {
        return new CachorroPrototype(this);
    }

    @Override
    public String exibirInfo() {
        return "Raça:" + getRaca() +"\nNome:" + getNome() + "\nIdade:" + getIdade();
    }

   
    
}

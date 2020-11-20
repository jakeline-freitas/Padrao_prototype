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
public class Main {
    public static void main(String[] args) {
        CachorroPrototype cachorro = new CachorroPrototype();
        
        AnimalPrototype cachorroPitbull =  cachorro.clonar();
        cachorroPitbull.setRaca("PitBull");
        cachorroPitbull.setNome("Rex");
        cachorroPitbull.setIdade("2 anos");
        
        AnimalPrototype cachorroShitzu = cachorro.clonar();
        cachorroShitzu.setRaca("Shitzu");
        cachorroShitzu.setNome("lulu");
        cachorroShitzu.setIdade("1 ano");
        
        System.out.println(cachorroPitbull.exibirInfo());
        System.out.println("-----------------------------");
        System.out.println(cachorroShitzu.exibirInfo());
        
        
    }
    
}

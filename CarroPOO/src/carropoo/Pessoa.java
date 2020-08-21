package carropoo;

/**
 *
 * @author jordy
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private Carro carro;
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    
    String getNome(){
        return this.nome;
    }
    
    Carro getCarro(){
        return carro;
    }
    
    void setCarro(Carro carro){
        this.carro = carro;
    }
    
    void ligarCarro(){
        carro.ligar();
    }
    
    void desligarCarro(){
        carro.desligar();
    }
    
    void acelerarCarro(){
        carro.acelerar();
    }
    
    void frearCarro(){
        carro.frear();
    }
    
    void setCambioCarro(int marcha){
        carro.setCambio(marcha);
    }
}

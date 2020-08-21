package carropoo;

class Carro {

    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private Pessoa dono = new Pessoa();
    private int cambio;
    
    void setCambio(int marcha){
        this.cambio = marcha;
    }
    
    int getCambio(){
        return this.cambio;
    }

    void setCor(String c){
        cor = c;
    }		
    String getCor(){
        return cor;
    }

    String getTipo(){
        return tipo;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }

    String getPlaca(){
        return placa;
    }
    void setPlaca(String placa){
        this.placa = placa;
    }

    int getNumPortas(){
        return numPortas;
    }
    
    void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    Pessoa getDono(){
        return dono;
    }
    
    void setDono(Pessoa dono){
        this.dono = dono;
    }
    
    void ligar(){
        System.out.println("Carro ligado");
    }
    
    void desligar(){
        System.out.println("Carro desligado");
    }
    
    void acelerar(){
        System.out.println("Carro acelerando");
    }
    
    void frear(){
        System.out.println("Carro freando");
    }
}
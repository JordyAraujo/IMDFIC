/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;

/**
 *
 * @author jordy
 */
public class AgendaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(12, 10, "Dia da Criança");
        agenda2.anote(7, 15, "Independência do Brasil");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
    
}

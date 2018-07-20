/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventififa;

/**
 *
 * @author PC22
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
    
    
    
     Torneo [] international =new Torneo [20] ;
     
     international[0]=new Torneo("mondiale","russia","10 giugno","9 luglio",20);
     international[1]=new Torneo("europeo","francia","16 giugno 2020","7 luglio 2020",20);
     
     System.out.println("Torneo:"+ international[0].getNomeTorneo());
     System.out.println("Organizzato dal presiudente FIFA:"+ international[0].presidente);
     System.out.println("Il torneo si è svolto in: " + international[0].getSedeTorneo());
          System.out.println("Data finale:" + international[0].getDataFine());
          System.out.println("La squadra vincitrice sara stabilita con un metodo random tra quelle che verranno inizializzate e sarà stampato il messaggio :"+international[0].premio);
     

     
    }
     
     
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventififa;


public class MainClass {
    public static void main(String[] args) {
    
     Torneo [] international = new Torneo [10];
     Squadra [] team = new Squadra [10]; //creo la struttura array
     
     team[0]=new Squadra(); // creo i campi dell'array
     team[0].setNome("Argentina");
     team[0].setPalmares("3 mondiali");
     team[0].setContinentenativo("America del sud");
     
     team[1]=new Squadra();
     team[1].setNome("francia");
     team[1].setPalmares("2 mondiali");
     team[1].setContinentenativo("Europa");
     
     team[2]=new Squadra();
     team[2].setNome("russia");
     team[2].setPalmares("0 mondiali");
     team[2].setContinentenativo("Europa");
     
     team[3]=new Squadra();
     team[3].setNome("spagna");
     team[3].setPalmares("1 mondiali");
     team[3].setContinentenativo("Europa");
     
     team[4]=new Squadra();
     team[4].setNome("italia");
     team[4].setPalmares("4 mondiali");
     team[4].setContinentenativo("Europa");
     
     international[0]= new Torneo("Mondiale","Russia","10 Giugno","9 luglio",10,team);
     international[1]= new Torneo("europeo","Francia","16 Giugno 2020","7 Luglio 2020",16,team);    
     
     System.out.println("Torneo:"+ international[0].getNomeTorneo());
     System.out.println("Organizzato dal presiudente FIFA:"+ international[0].presidente);
     System.out.println("Il torneo si è svolto in: " + international[0].getSedeTorneo());
     System.out.println("Data finale:" + international[0].getDataFine());
     System.out.println("Hai vinto: " + international[0].premio);
     
     System.out.println(international[0].getNomeTorneo());
    }
    
}
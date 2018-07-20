/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventififa;

/**
 *
 * @author PC19
 */
public class Torneo extends EventoFifa {
    
    private String nomeTorneo;
    private String sedeTorneo;
    private String dataInizio;
    private String dataFine;
    private int    numSquadre;
    
      
    
    public Torneo( String nomeTorneo, String sedeTorneo,String dataInizio, String dataFine, int  numSquadre )
    {
        super ("Infantino",1902,"hai vinto!!!");
        
        this.nomeTorneo=nomeTorneo;
        this.sedeTorneo=sedeTorneo;
        this.dataInizio= dataInizio;
        this.dataFine=dataFine;
        this.numSquadre=numSquadre;
    
    }

    public String getNomeTorneo() {
        return nomeTorneo;
    }

    public void setNomeTorneo(String nomeTorneo) {
        this.nomeTorneo = nomeTorneo;
    }

    public String getSedeTorneo() {
        return sedeTorneo;
    }

    public void setSedeTorneo(String sedeTorneo) {
        this.sedeTorneo = sedeTorneo;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }

    public int getNumSquadre() {
        return numSquadre;
    }

    public void setNumSquadre(int numSquadre) {
        this.numSquadre = numSquadre;
    }
    
    
      
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventififa;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventDatabase;
import java.util.ArrayList;

/**
 *
 * @author PC21
 */
public class Populator implements CalendarEventDatabase {    
    
    @Override 
    public void populate(ArrayList<CalendarEvent> events) {

        Torneo mondiale = new Torneo("Mondiale", "Russia", "30/06/2018", "15/07/2018", 16);

        Torneo europeo = new Torneo("Europeo", "Polonia", "30/06/2018", "15/07/2018", 16);

        Torneo championsLeague = new Torneo("ChampionsLeague", "Kiev", "30/06/2018", "15/07/2018", 16);
        
        Torneo europaLeague = new Torneo("EuropaLeague", "Madrid", "30/06/2018", "15/07/2018", 16);

        events.add(mondiale);
        events.add(europeo);
        events.add(championsLeague);
        events.add(europaLeague);

    }
}
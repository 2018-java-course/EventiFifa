/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventififa;

import calendar.api.CalendarEvent;
import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args) {
    
     Torneo [] international;
     international = new Torneo [10];
  
     
    ArrayList<CalendarEvent> myArrayList = new ArrayList<>();
     Populator populate = new Populator();
     
     populate.populate(myArrayList);
     
      myArrayList.forEach((calendarEvent) -> {
            System.out.println(((Torneo) calendarEvent).getNomeTorneo());
      });
}
    
}
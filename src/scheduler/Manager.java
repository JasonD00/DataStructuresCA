/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduler;

/**
 *
 * @author Jason
 */

//For the Admin Controls
public interface Manager {
        void removePatient(String name); //remove the patient 
        void undoLastRemovePatient(String name); //undo the last removal for a audit log 
        void trackNoShows(String name); //Track the no shows
        void saveD(); //save data to dat file
        void loadD(); //remove data from dat file
      
    
}

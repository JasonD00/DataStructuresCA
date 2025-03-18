/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduler;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Jason
 */
public class AdminControls implements Manager{
    private LinkedList<Patient> patientList;
    private PriorityQueue<Patient> patientQueue;
    private Queue<String> noShow;
    private Stack<Patient> undoStack;
    
    public AdminControls() {
        Object[] data = PatientManager.loadD();
        this.patientList = (LinkedList<Patient>) data[0];
        this.patientQueue = (PriorityQueue<Patient>) data[1];
        this.noShow = (Queue<String>) data[2];
        this.undoStack = (Stack<Patient>) data[3];
                
    }
    
    
  
    //Here I want to remove a patient and store them in an undo stack
    @Override
    public void removePatient(String name) { //I am taking string (name) and removing it
       for (Patient p : patientList) { //Check patient list make sure its a prat of my ArrayList <Patients>
           if (p.getName().equalsIgnoreCase(name)) { //get name and ignore the case 
              undoStack.push(p); //tarck removed p and store
               patientList.remove(p); //remove pPatient from List
               System.out.println("Removed: " + name);
               
                saveD();
               return;
           }
       }
        System.out.println("Not found ");
    }

    //undo the last removal here  
    @Override
    public void undoLastRemovePatient(String name) {
        if (!undoStack.isEmpty()) { //checking if emnopty 
            Patient res = undoStack.pop(); //return the recent undo
            patientList.add(res); //add back to p list
               System.out.println("Undo done " + res.getName());
            saveD();
        } else {
             System.out.println("Undo fail");
        }
    }

    @Override
    public void trackNoShows(String name) {
      if (noShow.size()== 5) {
          noShow.poll();
      }
      noShow.add(name);
      saveD();
    }

    //Save and load patient data here 
    
    @Override
    public void saveD() {
       PatientManager.saveD(patientList, patientQueue, noShow, undoStack);
    }

    @Override
    public void loadD() {
      Object[] data = PatientManager.loadD();
      this.patientList = (LinkedList<Patient>) data[0];
      this.patientQueue = (PriorityQueue<Patient>) data[1];
      this.noShow = (Queue<String>)data[2];
      this.undoStack = (Stack<Patient>)data[3];
      
    }
    
}

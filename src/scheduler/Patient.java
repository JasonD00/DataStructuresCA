/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduler;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
//The Patient class, implements the schedule and is made serializable for file storage in realtion to my dat file
public class Patient implements Schedule, Serializable{
    private String name;
    private int age;
    private String priority;
    private boolean hospitalRoom;
    
        //Basic Patient details (4 parameteres)
        public Patient (String name, int age, String priority, boolean hospitalRoom) {
            this.name = name;
            this.age = age;
            this.priority = priority;
            this.hospitalRoom = hospitalRoom;
        }

    //placehlder methods for now might add getdetails to patient attributes later 
    @Override
    public void scheduleTest() {
       System.out.println(name + " has been updated for a blood test.");
    }

    @Override
    public void updatePriority(String newPrior) {
        this.priority = newPrior;
         System.out.println(name + " priority has been updated to " + newPrior);
    }

    @Override
    public void cancelTest() {
       System.out.println(name + " has canceled their test.");
    }

    @Override
    public void rescheduleTest() {
        System.out.println(name + " has been resheduled");
    }
    // Getter methods to retrieve the patients details
    public String getName() {
        return name;}
   
    public int getAge() {
        return age;}
   
    public String getPriority() {
        return priority;}
    
    public boolean getRoom() {
        return hospitalRoom;
    }
}

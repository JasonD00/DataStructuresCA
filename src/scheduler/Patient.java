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
    
    //Basic Patient details 
    public Patient (String name, int age, String priority, boolean hospitalRoom) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.hospitalRoom = hospitalRoom;
    }

    //placehlder methods for now might add getdetails to patient attributes later 
    @Override
    public void scheduleTest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updatePriority(String newPrior) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelTest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void rescheduleTest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduler;

/**
 *
 * @author Jason
 */
//Basis for implementing the schedule for my patient class
//Handles Schedule functions
public interface Schedule {
   void scheduleTest(); //schedule a test
   void updatePriority(String newPrior); //Updating the priority of a test
   void cancelTest(); //Canceling a test
}

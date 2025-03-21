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
public class Patient implements Schedule, Serializable, Comparable<Patient>, CheckIn{
    private String name;
    private int age;
    private String priority;
    private boolean hospitalRoom;
    private String GP;
    private boolean Checked;
    
    
        //Basic Patient details (4 parameteres)
        public Patient (String name, int age, String priority, boolean hospitalRoom, String GP, boolean Checked) {
            this.name = name;
            this.age = age;
            this.priority = priority; //Urgent, Medium, Minor
            this.hospitalRoom = hospitalRoom;
            this.GP = GP;
            this.Checked = Checked;
        }

     
    @Override
    public void scheduleTest() {
       System.out.println( "Updated for a blood test.");
    }

    @Override
    public void updatePriority(String newPrior) {
        this.priority = newPrior;
         System.out.println("Priority has been updated.");
    }

    @Override
    public void cancelTest() {
       System.out.println("Test Cancelled.");
    }

   
    
    //added a toString as my debugg statment showed the data wasnt loading for the priority queue properly just showed symbols
    @Override
public String toString() {
    return "Patient{name='" + name + "', age=" + age + ", priority='" + priority + "', hospitalRoom=" + hospitalRoom + "', GP=" + GP  + "', Checked=" + Checked  +"}";

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
    
   
    
    public String getGP() {
        return GP;}
    
      public boolean getChecked() {
        return Checked;
    }

    
    //Compare method must return -1 for highets priority
    //1  for lower priority
    // and 0 if patientsd are equal
    @Override
    public int compareTo(Patient other) {
       int thisPriority = getPriorityNum(this.priority);
    int otherPriority = getPriorityNum(other.priority);
    
    int result = Integer.compare(thisPriority, otherPriority);
    System.out.println("Comparing " + this + " with " + other + " - " + result);
    return result;
    }
    
    //Initially I thought this would work but it did not assign based on priority
    // my intial compare.to was returning 0
    // so my interger.compare returned 0.0 treatinbg all patients as the same 
  
    // private int getPriorityNum (String priority) {
      //  return switch (priority.toUpperCase()) {
       //    case "URGENT":
       //     return 1;  // Highest priority
       // case "MEDIUM":
        //    return 2;
       // case "MINOR":
        //    return 3;  // Lowest priority
         //   default -> Integer.MAX_VALUE;
       // };
   // }
    
    // changes so each patient has a value when compared 
    private int getPriorityNum(String priority) {
    switch (priority.toUpperCase()) {
        case "URGENT": 
            return 1;  
        case "MEDIUM":
            return 2;
        case "MINOR":
            return 3;  
        default:
            return Integer.MAX_VALUE;  
    }
}

    //checking if a patient has checked in 
    @Override
    public void check() {
         if (this.Checked) {
        System.out.println(name + " is already checked in.");
    } else {
        this.Checked = true;
        System.out.println(name + " has checked in successfully.");
    }
    }
    
    
}
 
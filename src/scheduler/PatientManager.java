package scheduler;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import scheduler.Patient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jason
 */

//Storage inline with my chosen data structures
//Linked List, Priority Queue, Queue and a Stack
public class PatientManager {
    private static final String File_Name = "patients.dat";
    
        public static void saveD (LinkedList<Patient> patientList, PriorityQueue<Patient> patientQueue, Queue<String> noShowQueue, Stack<Patient> undoStack) {

            try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(File_Name))) {
                
                
                output.writeObject(patientList);
                output.writeObject(patientQueue);
                output.writeObject(noShowQueue);
                output.writeObject(undoStack);
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        
        
                //loading from the file
        public static Object[] loadD() {
             File file = new File(File_Name);
    if (!file.exists()) {
        System.out.println("No save");
        return new Object[]{new LinkedList<>(), new PriorityQueue<>(), new LinkedList<>(), new Stack<>()};
    }
//tidying up code and adding debug stack to fix issues with patientQueue
//reading serialized objects froma file 
    try (ObjectInputStream obIn = new ObjectInputStream(new FileInputStream(File_Name))) {
        LinkedList<Patient> loadedPatientList = (LinkedList<Patient>) obIn.readObject();
        PriorityQueue<Patient> loadedPatientQueue = (PriorityQueue<Patient>) obIn.readObject();
        Queue<String> loadedNoShowQueue = (Queue<String>) obIn.readObject();
        Stack<Patient> loadedUndoStack = (Stack<Patient>) obIn.readObject();

        //debugging, printing loaded data, dont change had to be fixed 3 times due to non loading data
        System.out.println("Data loaded:");
        System.out.println("Patients List: " + loadedPatientList);
        System.out.println("Priority Queue: " + loadedPatientQueue);
        System.out.println("No-Show Queue: " + loadedNoShowQueue);
        System.out.println("Undo Stack: " + loadedUndoStack);

        return new Object[]{loadedPatientList, loadedPatientQueue, loadedNoShowQueue, loadedUndoStack};
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
        return new Object[]{new LinkedList<>(), new PriorityQueue<>(), new LinkedList<>(), new Stack<>()};
    }
        }
}

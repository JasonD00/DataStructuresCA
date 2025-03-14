package scheduler;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
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
    
        public static void saveD (LinkedList<Patient> patientList) {

            try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(File_Name))) {
                output.writeObject(patientList);
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        public static Object[] loadD() {
            File file = new File(File_Name);
            if (!file.exists()) return new Object[] {new LinkedList<>()} ;
            
            try (ObjectInputStream obIn = new ObjectInputStream(new FileInputStream(File_Name))) {
                return new Object[]{(LinkedList<Patient>) obIn.readObject()};
                
            } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error " + e.getMessage());
                    return new Object[] {new LinkedList<>()};
                    }
        }
        }

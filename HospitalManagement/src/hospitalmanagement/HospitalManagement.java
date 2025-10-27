/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmanagement;

/**
 *
 * @author Admin
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalManagement {
    public static void main(String[] args) {
        
      Queue<Patient> arrivalQueue = new LinkedList<>();
      
      Queue<Patient> treatmentQueue = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));
      
      Patient anna = new Patient("Anna", 3);
      Patient bob = new Patient("Bob", 1);
      Patient carla = new Patient("Carla", 2);
      Patient dave = new Patient("Dave", 1);
      
      arrivalQueue.add(anna);
      arrivalQueue.add(bob);
      arrivalQueue.add(carla);
      arrivalQueue.add(dave);
      
      treatmentQueue.add(anna);
      treatmentQueue.add(bob);
      treatmentQueue.add(carla);
      treatmentQueue.add(dave);
      
      System.out.println("=== Arrival Order ===");
      System.out.println("Arrival Order: [" + anna + "," + bob + "," + carla + "," + dave + "]");
      
      System.out.println("\n=== Treatment Order ===");
      System.out.println("Treating:" + treatmentQueue.poll());
      System.out.println("Treating:" + treatmentQueue.poll());
      System.out.println("Treating:" + treatmentQueue.poll());
      System.out.println("Treating:" + treatmentQueue.poll());
    }
    
static class Patient {
    String name;
    int severity;
    
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public String toString(){
        return name + " (Severity:" + severity + ")";
    }
    }
}
        

        
       
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activityset;

/**
 *
 * @author Admin
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.HashSet;


public class ActivitySet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <String> name = new ArrayList <>();
        
        
        name.add("Nana");
        name.add("Gusion");
        name.add("Lance");
        name.add("Dyroth");
        name.add("Balmond");
        name.add("Brody");
        name.add("Nana");
        name.add("Lapu");
        name.add("Alice");
        
        System.out.println("Original List (Unorganized with Duplicates):");
        System.out.println(name);
        
        Set <String> mlnames = new HashSet <> (name);
        System.out.println("\n ML Hero Names (Using HashSet):");
        System.out.println(mlnames);
        
        Set <String> sortedHero = new TreeSet <> (name);
        System.out.println("\nSorted and ML hero Names (Using TreeSet):");
        System.out.println(sortedHero);
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}

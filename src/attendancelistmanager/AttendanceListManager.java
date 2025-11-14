import java.util.Scanner;
import java.util.TreeSet;

public class AttendanceListManager {

    public static void main(String[] args) {

        TreeSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                System.out.print("Enter student ID: ");
                String id = sc.nextLine();

                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                String data = name + " - " + id;

                if (students.contains(data)) {
                    System.out.println("Student already exists!");
                } else {
                    students.add(data);
                    System.out.println("Student added!");
                }

            } else if (choice == 2) {
                System.out.print("Enter student name to delete: ");
                String name = sc.nextLine();

                boolean found = false;
                String toRemove = null;

                for (String s : students) {
                    if (s.toLowerCase().startsWith(name.toLowerCase())) {
                        toRemove = s;
                        found = true;
                        break;
                    }
                }

                if (found) {
                    students.remove(toRemove);
                    System.out.println("Student deleted!");
                } else {
                    System.out.println("Student not found!");
                }

            } else if (choice == 3) {
                if (students.isEmpty()) {
                    System.out.println("No students yet.");
                } else {
                    System.out.println("\nAttendance List (Auto-sorted A–Z):");
                    for (String s : students) {
                        System.out.println(s);
                    }
                }

            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AttendanceListManager {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> ids = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
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

                String key = id + "-" + name.toLowerCase();

                if (set.contains(key)) {
                    System.out.println("Student already exists!");
                } else {
                    ids.add(id);
                    names.add(name);
                    set.add(key);
                    System.out.println("Student added!");
                }

            } else if (choice == 2) {
                System.out.print("Enter student ID to delete: ");
                String id = sc.nextLine();
                System.out.print("Enter student name to delete: ");
                String name = sc.nextLine();

                String key = id + "-" + name.toLowerCase();

                if (set.remove(key)) {
                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i).equals(id) && names.get(i).equalsIgnoreCase(name)) {
                            ids.remove(i);
                            names.remove(i);
                            break;
                        }
                    }
                    System.out.println("Student deleted!");
                } else {
                    System.out.println("Student not found!");
                }

            } else if (choice == 3) {
                System.out.println("\nAttendance List:");
                if (names.isEmpty()) {
                    System.out.println("No students yet.");
                } else {
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println(names.get(i) + " - " + ids.get(i));
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AttendanceListManager {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
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
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                if (set.contains(name.toLowerCase())) {
                    System.out.println("Already in the list!");
                } else {
                    list.add(name);
                    set.add(name.toLowerCase());
                    System.out.println("Added!");
                }

            } else if (choice == 2) {
                System.out.print("Enter name to delete: ");
                String name = sc.nextLine();

                if (set.remove(name.toLowerCase())) {
                    list.removeIf(n -> n.equalsIgnoreCase(name));
                    System.out.println("Deleted!");
                } else {
                    System.out.println("Not found!");
                }

            } else if (choice == 3) {
                System.out.println("\nAttendance List:");
                if (list.isEmpty()) {
                    System.out.println("No students yet.");
                } else {
                    for (String s : list) {
                        System.out.println("- " + s);
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

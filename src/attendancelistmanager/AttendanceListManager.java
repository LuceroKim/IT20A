import java.util.Scanner;
import java.util.TreeSet;

public class AttendanceListManager {

    public static void main(String[] args) {

        // 3 separate sections
        TreeSet<String> gitBash = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        TreeSet<String> gitPush = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        TreeSet<String> gitCommit = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Choose a Section ===");
            System.out.println("1. Section GitBash");
            System.out.println("2. Section GitPush");
            System.out.println("3. Section GitCommit");
            System.out.println("4. Exit");
            System.out.print("Choose section: ");
            int sectionChoice = Integer.parseInt(sc.nextLine());

            TreeSet<String> selectedSection = null;
            String sectionName = "";

            if (sectionChoice == 1) {
                selectedSection = gitBash;
                sectionName = "Section GitBash";
            } else if (sectionChoice == 2) {
                selectedSection = gitPush;
                sectionName = "Section GitPush";
            } else if (sectionChoice == 3) {
                selectedSection = gitCommit;
                sectionName = "Section GitCommit";
            } else if (sectionChoice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid section choice!");
                continue;
            }

            while (true) {
                System.out.println("\n=== " + sectionName + " ===");
                System.out.println("1. Add Student");
                System.out.println("2. Delete Student");
                System.out.println("3. View List");
                System.out.println("4. Back to Section Menu");
                System.out.print("Choose: ");
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("Enter student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    String data = name + " - " + id;

                    if (selectedSection.contains(data)) {
                        System.out.println("Student already exists!");
                    } else {
                        selectedSection.add(data);
                        System.out.println("Student added!");
                    }

                } else if (choice == 2) {
                    System.out.print("Enter student name to delete: ");
                    String name = sc.nextLine();

                    boolean found = false;
                    String toRemove = null;

                    for (String s2 : selectedSection) {
                        if (s2.toLowerCase().startsWith(name.toLowerCase())) {
                            toRemove = s2;
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        selectedSection.remove(toRemove);
                        System.out.println("Student deleted!");
                    } else {
                        System.out.println("Student not found!");
                    }

                } else if (choice == 3) {
                    if (selectedSection.isEmpty()) {
                        System.out.println("No students yet.");
                    } else {
                        System.out.println("\nAttendance List (Auto-sorted A–Z):");

                        int num = 1;
                        for (String s3 : selectedSection) {
                            System.out.println(num + ".) " + s3);
                            num++;
                        }

                        System.out.println("\nTotal Students: " + selectedSection.size());
                    }

                } else if (choice == 4) {
                    break; // back to section menu

                } else {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}

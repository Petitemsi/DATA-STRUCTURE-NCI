public class App {

    public static void main(String[] args) {

        StudentList list = new StudentList();

        Student s1 = new Student(101, "Ali", 3.2);
        Student s2 = new Student(102, "Sara", 3.8);
        Student s3 = new Student(103, "Omar", 2.9);
        Student s4 = new Student(104, "Lina", 3.6);

        list.insertAtEnd(s1);
        list.insertAtEnd(s2);
        list.insertAtEnd(s3);
        list.insertAtEnd(s4);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("\nBackward:");
        list.displayBackward();

        System.out.println("\nSearching for ID 103:");
        Student found = list.searchById(103);

        if (found != null)
            System.out.println(found);
        else
            System.out.println("Not found");

        System.out.println("\nUpdating GPA of ID 102:");
        Student update = list.searchById(102);
        if (update != null) {
            update.setGpa(4.0);
        }

        list.displayForward();

        System.out.println("\nDeleting ID 101:");
        list.deleteById(101);

        list.displayForward();
    }
}

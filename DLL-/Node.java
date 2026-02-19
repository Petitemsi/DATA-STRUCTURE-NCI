public class Node {

    Student student;
    Node next;
    Node prev;

    public Node(Student student) {
        this.student = student;
        next = null;
        prev = null;
    }
}

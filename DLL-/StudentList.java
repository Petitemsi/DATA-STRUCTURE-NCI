public class StudentList implements DDLInterface {

    Node head;
    Node tail;

    @Override
    public void insertAtEnd(Student s) {

        Node newNode = new Node(s);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.student);
            temp = temp.next;
        }
    }

    @Override
    public void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.println(temp.student);
            temp = temp.prev;
        }
    }

    @Override
    public Student searchById(int id) {

        Node temp = head;

        while (temp != null) {
            if (temp.student.getId() == id) {
                return temp.student;
            }
            temp = temp.next;
        }

        return null;
    }

    @Override
    public void deleteById(int id) {

        Node temp = head;

        while (temp != null) {

            if (temp.student.getId() == id) {

                // if deleting first node
                if (temp == head) {
                    head = temp.next;
                    if (head != null)
                        head.prev = null;
                    else
                        tail = null;
                }
                // if deleting last node
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                }
                // if deleting middle
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Student deleted.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found.");
    }
}

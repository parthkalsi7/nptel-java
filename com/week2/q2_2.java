class School {
    void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}
class Student {
    void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}
public class q2_2{
    public static void main(String[] args) {
        Student student = new Student();
        student.print();
        School school = new School();
        school.print();
    }
}
public class Student extends Person {
//    implicit casting
//    Person p = new Student();
//    explicit casting
//    Student s = (Student) new Person();
    public void m2(){
        System.out.println("This is a Student");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.m2();
        s.m();
        Person p = new Student();
        p.m();
//        p.m2(); //because the student is no longer a mere student but a student is a person and the hence belongs to the person category
    }
}

import model.Student;

public class Application {

    public static void main(String[] args) {
        Student student = new Student("chen", "Cedric", 23, "男");
        System.out.println(student.getIdNo());
        System.out.println(student.getNames());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}

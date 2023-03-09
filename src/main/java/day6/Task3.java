package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Юлия Андреевна", "Рисование");
        Student student = new Student("Дмитрий");
        teacher.evaluate(student);
    }
}

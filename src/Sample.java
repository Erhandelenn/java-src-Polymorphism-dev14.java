
public class Sample {
    public void yazdir(Person person) {
        person.yazdir();
    }

    public static void main(String[] args) {
        Student student = new Student("Erhan", "Delen", 25, "50214526456", 2.82);
        Teacher teacher = new Teacher("Bilal", "Demir", 32, "6587654321",
                new String[]{"JAVA", "SQL", "Backend"}, "Bilgisayar Mühendisi");
        Staff staff = new Staff("Mehmet", "Ekşi", 50, "68548451254", "Hademe");

        Sample sample = new Sample();

        sample.yazdir(student);
        sample.yazdir(teacher);
        sample.yazdir(staff);
    }
}
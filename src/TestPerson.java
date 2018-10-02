import java.util.LinkedList;

/**
 * Created by coag on 02-10-2018.
 */
public class TestPerson {

    public static void main(String[] args) {
        Person student = new Student("Alice");
        Person teacher = new Teacher("Bob");
        Person teacher2 = new Teacher("Lau");
//        teacher2.setName("L");

        LinkedList<Person> persons = new LinkedList<>();

        persons.add(student);
        persons.add(teacher);
        persons.add(teacher2);

        persons.forEach((p) -> {
            System.out.println(p.getName());
            p.doExam();
        });

    }
}

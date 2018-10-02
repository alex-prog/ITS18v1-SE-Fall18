/**
 * Created by coag on 02-10-2018.
 */
public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public void doExam(){
        System.out.println("I will pass the exam.");
    }
}

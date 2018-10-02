/**
 * Created by coag on 02-10-2018.
 */
public class Teacher extends Person {

    public Teacher(String name){
        super(name);
    }

    @Override
    public void doExam() {
        System.out.println("I will ask the questions");
    }
}

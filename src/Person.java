/**
 * Created by coag on 02-10-2018.
 */
public abstract class Person {

    private String name;
    private int id;

    public Person(String name){
        this.name = name;
    }

    public abstract void doExam();


    public String getName() {
        if(name == null || name.length() == 0){
            return "Name Not Set";
        }
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2){
            this.name = name;
        } else {
            throw new Error("Name is not valid");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

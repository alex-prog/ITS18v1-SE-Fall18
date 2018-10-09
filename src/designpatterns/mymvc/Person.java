package designpatterns.mymvc;

/**
 * Created by coag on 09-10-2018.
 * Model
 */
public class Person {
    private String name;
    private String cpr; //0910184545

    public Person(){}

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
}

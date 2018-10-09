package designpatterns.mymvc;

/**
 * Created by coag on 09-10-2018.
 */
public class RunMVC {

    public static void main(String[] args) {
        Person p = new Person("alice", "2612814546");
        System.out.println(PersonController.getGender(p));

        System.out.println(PersonView.getJSON(p));
        System.out.println(PersonView.getHTML(p));
    }
}

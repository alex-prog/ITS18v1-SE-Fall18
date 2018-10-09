package designpatterns.mymvc;

/**
 * Created by coag on 09-10-2018.
 * View
 */
public class PersonView {

    public static String getJSON(Person p) {
        String json = "{";

        json += "\"name\":\"" + p.getName() + "\",";
        json += "\"cpr\":\"" + p.getCpr() + "\",";
        json += "\"gender\":\"" + PersonController.getGender(p) + "\"";

        json += "}";
        return json;
    }
}

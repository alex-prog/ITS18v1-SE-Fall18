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

    public static String getHTML(Person p) {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Person</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                MyUtil.printLine("<h1>Name:</h1>") +
                MyUtil.printLine("<p>" + p.getName() + "</p>\n") +
                "\n" +
                "<h1>CPR:</h1>\n" +
                "<p>" + p.getCpr() + "</p>\n" +
                "<h1>Gender:</h1>\n" +
                "<p>" + PersonController.getGender(p) + "</p>\n" +
                "</body>\n" +
                "</html>";

        return html;
    }
}

package designpatterns.mymvc;

/**
 * Created by coag on 09-10-2018.
 * Controller
 */
public class PersonController {

    public static String getGender(Person person) {
        String cpr = person.getCpr();
        String cprLastDigitSting = cpr.substring(cpr.length() - 1);
        int cprLastDigitInt = Integer.parseInt(cprLastDigitSting);
       /*
        if(cprLastDigitInt % 2 == 0){
            return "F";
        } else {
            return "M";
        }*/

        return (cprLastDigitInt % 2 == 0) ? "F" : "M";

    }
}

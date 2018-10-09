package designpatterns;

/**
 * Created by coag on 09-10-2018.
 */
public class RunMe {


    public static void main(String[] args) {
        DBConn conn = DBConn.getInstance("123.123.12.12:3306", "root", "root");
    }
}

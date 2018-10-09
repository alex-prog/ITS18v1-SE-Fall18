package designpatterns;

/**
 * Created by coag on 09-10-2018.
 */
public class DBConn {
    private static DBConn conn = null;

    private DBConn(String URL, String userName, String pass){
        //make conn here
    }

    public static synchronized DBConn getInstance(String URL, String userName, String pass){
        if(conn == null){
            conn = new DBConn(URL, userName, pass);
        }
        return conn;
    }


}

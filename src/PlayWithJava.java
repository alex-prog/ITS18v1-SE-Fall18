import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by coag on 02-10-2018.
 */
//Play_with_java
public class PlayWithJava {

    public static void main(String[] args) {
//
//        //-------- primitve types
//        int x = 5;
//        long xl = 6754765457L;
//        short xs = 56;
//        byte xxs = 127;
//
//        char c = 'a';
//        char cc = 97;
//        System.out.println(cc);
//
//        double d = 3.14;
//        float ff = 3.14f;
//
//        boolean b = true;
//
//        //this is a one line comment
//
//        /*
//        this
//        is a multi line
//        comment
//         */
//
//
//
//        //----------Objects
//
//        String s = "This is string";
//        String ss = new String("this is a new string");
//
//        PlayWithJava play = new PlayWithJava();
//
//
//        //---Java is not good at calculating
//
//        double dd = .1; //0.1
//        double ddd = (dd*10000000 + 0.2*10000000)/10000000;
//        System.out.println(ddd);
//
//        BigDecimal bd = new BigDecimal(0.1);
//        bd = bd.add(new BigDecimal(0.2));
//        System.out.println(bd);
//
//        //-------operators
//
//        System.out.println(5+2); //7
//        System.out.println(5-2); //3
//        System.out.println(5*2); //10
//        System.out.println(5/2); //2
//        System.out.println(5.0/2); //2
//        System.out.println(5%2); //1
//
//
//        System.out.println(true && false); //false
//        System.out.println(true || false); //true
//        System.out.println(!true); //false

//        System.out.println(1 | 0);
//        System.out.println(1 & 0);
//        System.out.println(7 & 2);
//        System.out.println(~2);


//        int xIf = 9;
//        if (xIf > 5) {
//            xIf = 100;
//        } else {
//            xIf = 0;
//        }
//        System.out.println(xIf);
//
//        int xT = 9;
//        xT = (xT > 5) ? 100 : 0;
//
//        System.out.println(xT);


        ArrayList<String> names = new ArrayList<>();
        names.add("alice");
        names.add("bob");
        names.add("claus");
        names.add("david");
        names.add("eva");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).toUpperCase());
        }

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        names.forEach((name) -> {
            System.out.println(name.toUpperCase());
        });


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("hi");
        });

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Claus");

        students.forEach((K, V) -> {
            System.out.println(K + ": " + V);
        });



    }


}

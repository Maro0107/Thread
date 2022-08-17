import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> testList = new ArrayList<>(Arrays.asList("1", "93", "43", "234"));
        System.out.println(testList);


        Thread t1 = new Thread(new Worker1());
        Thread t2 = new Thread(new Worker2(t1));

        t1.start();
        t2.start();
    }


}

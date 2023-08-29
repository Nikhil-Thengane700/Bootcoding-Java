import com.bootcoding.java.OOPS.Cycle;

public class CycleApplication {
    public static void main(String[] args) {

        Cycle c1= Cycle.createCycle();
        Cycle c2= Cycle.createCycle(7000, "Pink", "Girls");

        Cycle.printCycle(c1);
        Cycle.printCycle(c2);

    }
}

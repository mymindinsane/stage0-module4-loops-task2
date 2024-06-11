package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int n = 0;
        while (counter <= printToInclusive){
            n *= counter;
            System.out.println(n);
            counter++;
        }
    }
}

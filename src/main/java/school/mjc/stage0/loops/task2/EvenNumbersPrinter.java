package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        System.out.println(counter);
        while (counter + 2 <= printTillInclusive ) {
            System.out.println(counter + 2);
            counter += 2;
        }


    }
}

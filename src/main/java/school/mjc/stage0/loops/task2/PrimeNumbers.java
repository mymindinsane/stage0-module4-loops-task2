package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive){
            boolean isPrime = true;
            double squareRoot = Math.sqrt(counter) + 2;
            int r = 2;
            while (r <= squareRoot && isPrime) {
                if (counter % r == 0) isPrime = false;
                r++;
            }
            if (isPrime){
                System.out.println(counter);
            }
            counter++;
        }
    }
}

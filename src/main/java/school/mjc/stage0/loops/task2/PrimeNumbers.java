package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
   {
    int counter = 2;
    while (counter < printToInclusive){
    int i = 2;
    boolean flag = false;
    while (i <= counter / 2) {
      if (counter % i == 0) {
        flag = true;
        break;
      }
      ++i;
    }
    if (!flag)
      System.out.println(counter);
      counter++;
    }

    }
}

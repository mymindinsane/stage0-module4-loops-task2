package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        if (power > 0){
            while (counter < power) {
                System.out.println(Math.pow(counter, power));
                counter++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}

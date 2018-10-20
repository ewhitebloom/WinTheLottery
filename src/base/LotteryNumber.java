package base;

import java.util.*;

class LotteryNumber {
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int powerball;

    protected LotteryNumber() {
        List baseNumbers = genBaseNumbers();
        this.one = (int) baseNumbers.get(0);
        this.two = (int) baseNumbers.get(1);
        this.three = (int) baseNumbers.get(2);
        this.four = (int) baseNumbers.get(3);
        this.five = (int) baseNumbers.get(4);
        this.powerball = genPowerBall(baseNumbers);
    }

    protected LotteryNumber(int one, int two, int three, int four, int five, int powerball) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.powerball = powerball;
    }


    private static int genNumber() {
        return new Random().nextInt(70) + 1;
    }

    private static int genPowerBall(List baseNumbers) {
        int powerball = new Random().nextInt(25) + 1;

        while (baseNumbers.contains(powerball)) {
            powerball = new Random().nextInt(25) + 1;
        }

        return powerball;
    }

    private static List genBaseNumbers() {
        List<Integer> baseNumbers = new ArrayList<Integer>();

        while (baseNumbers.size() != 5) {
            int newNumber = genNumber();

            if (!baseNumbers.contains(newNumber)) {
                baseNumbers.add(newNumber);
            }
        }

        Collections.sort(baseNumbers);

        return baseNumbers;
    }

    Boolean equals(LotteryNumber winningNumber) {
        return this.one == winningNumber.one && this.two == winningNumber.two && this.three == winningNumber.three && this.four == winningNumber.four && this.five == winningNumber.five && this.powerball == winningNumber.powerball;
    }


    public String toString() {
        List numbs = new ArrayList();
        numbs.add(this.one);
        numbs.add(this.two);
        numbs.add(this.three);
        numbs.add(this.four);
        numbs.add(this.five);
        numbs.replaceAll(Object::toString);

        return String.join(", ", numbs) + ", (" + this.powerball + ")";
    }
}

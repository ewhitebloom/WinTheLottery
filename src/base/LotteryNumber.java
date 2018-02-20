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
        this.one = genNumber();
        this.two = genNumber();
        this.three = genNumber();
        this.four = genNumber();
        this.five = genNumber();
        this.powerball = genPowerBall();
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
        return new Random().nextInt(69) + 1;
    }

    private static int genPowerBall() {
        return new Random().nextInt(26) + 1;
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

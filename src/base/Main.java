package base;

import base.LotteryNumber;

public class Main {

    public static void main(String[] args) {
	  LotteryNumber winningNumber = new LotteryNumber(9, 53, 55, 62, 64, 1);

	  System.out.println("The winning number is: " + winningNumber.toString());

	  LotteryNumber ticket = new LotteryNumber();

	  long tickets = 1;

	  while (!ticket.equals(winningNumber)) {
	      ticket = new LotteryNumber();
//	      System.out.println(ticket.toString());
//		  System.out.println(ticket.equals(ticket));
	      tickets++;

	      if (tickets % 1000000 == 0) {
	      	System.out.println("Tickets count: " + tickets);
          }
      }

      System.out.println("You have won the lottery in " + tickets + " trie(s)!");
    }
}

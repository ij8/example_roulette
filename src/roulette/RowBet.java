package roulette;

import util.ConsoleReader;

public class RowBet extends Bet{
	public RowBet(){
		super("Three in a Row", 11,"" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, 34));
	}
}

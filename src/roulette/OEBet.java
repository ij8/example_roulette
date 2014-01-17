package roulette;

import util.ConsoleReader;

public class OEBet extends Bet{
	public OEBet()	{
		super("Odd or Even", 1,ConsoleReader.promptOneOf("Please bet", "even", "odd"));
	}
}

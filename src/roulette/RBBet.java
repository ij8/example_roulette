package roulette;

import util.ConsoleReader;

public class RBBet extends Bet{	
	public RBBet()	{
		super("Red or Black",1,ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED));
	}
}

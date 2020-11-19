package edu.aubg.game;

public class Scores {

	private int wins, losses, ties;
	
	Scores(){
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTies() {
		return ties;
	}

	public void setWins() {
		++wins;
	}

	public void setLosses() {
		++losses;
	}

	public void setTies() {
		++ties;
	}
	
	
	
}

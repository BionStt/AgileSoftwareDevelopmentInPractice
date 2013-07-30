package de.kimminich.agile.lecture6.poker;

public abstract class Hand implements Comparable<Hand> {

	abstract HandCategory getHandCategory();

	@Override
	public int compareTo(Hand other) {
		return getHandCategory().compareTo(other.getHandCategory());
	}

}

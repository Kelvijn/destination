package com.ucll;


public class Review {

	private long id = -99;
	private String name,auteur, positive, negative;
	private int score;
	public Review() {
		
	}
	public Review(long id, String name, String auteur, String positive, String negative, int score) {
		setId(id);
		setName(name);
		setAuteur(auteur);
		setPositive(positive);
		setNegative(negative);
		setScore(score);
	}
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getNegative() {
		return negative;
	}
	public void setNegative(String negative) {
		this.negative = negative;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}

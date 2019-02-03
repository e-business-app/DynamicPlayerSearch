package com.beans;
/**
 * Player Bean, which has getters and setters for 
 * the attributes in the playerInfo table.
 * 
 * @author  https://github.com/e-business-app
 * @version 1.0
 * @since   2019-01-31
 * 
 **/
public class Player {
	private int id;
	private String fullName;
	private int age;
	private String country;
	private int rating;
	private int potential;
	private String team;
	private String price;
	private String wage;
	private int totalStats;
	
	/**
	 * get Id
	 * @return it returns the player associated ID.
	 */
	public int getId() {
		return id;
	}
	/**
	 * set ID.
	 * @param id Id of Player
	 */
	public void setId(int id) {
		this.id=id;
	}
	/**
	 * get Full Name.
	 * @return String.
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * set Full Name.
	 * @param fullName
	 */
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	/**
	 * 
	 * Get Age of the player
	 * @return age.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Set the age of the player.
	 * @param age
	 */
	public void setAge(int age) {
		this.age=age;
	}
	/**
	 * 
	 * Get the country of the player
	 * @return country;
	 */
	public String getCountry() {
		return country;
	}
	/**
	 *
	 * Set the country of the player
	 * @param country
	 */
	public void setCountry(String country) {
		this.country=country;
	}
	/**
	 * Get the rating of the player
	 * @return rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * Sets the rating of the player
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating=rating;
	}
	/**
	 * Get the potential of the player.
	 * @return potential
	 */
	public int getPotential() {
		return potential;
	}
	/**
	 * 
	 * Set the potential of the player.
	 * @param potential
	 */
	public void setPotential(int potential) {
		this.potential=potential;
	}
	/**
	 * 
	 * Get the team of the player.
	 * @return team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * 
	 * Set the team of the player.
	 * @param team
	 */
	public void setTeam(String team) {
		this.team=team;
	}
	/**
	 * 
	 * Get Price of Player
	 * @return String.
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * Set Price of Player
	 * @param price
	 */
	public void setPrice(String price) {
		this.price=price;
	}
	/**
	 * Get Wage of Player.
	 * @return wage
	 */
	public String getWage() {
		return wage;
	}
	/**
	 * Set Wage of Player
	 * @param wage
	 */
	public void setWage(String wage) {
		this.wage=wage;
	}
	/**
	 * Get Total Stats of Player.
	 * @return totalStats
	 */
	public int getTotalStats() {
		return totalStats;
	}
	/**
	 * 
	 * Set Total Stats of Player.
	 * @param totalStats
	 */
	public void setTotalStats(int totalStats) {
		this.totalStats=totalStats;
	}
	
}

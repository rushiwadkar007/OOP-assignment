package com.forum.units;

public class Question extends AbstractEntity {

	//brief description of question
	private String title;
	//detail question
	private String message;
	//user who asked the question
	private User user;
	//number of upvotes for the question.
	private int upvoteCount = 0;
	//id of the last question asked on discussion forum
	private static Long lastEntry = 0L;

	public void autoGenerateId() {
		lastEntry = lastEntry +1L;
		setId(lastEntry);
		//first called lastEntry variable of this class.
		//then called setId() method of the parent class.


		// please write your code below and follow this instruction:
		// 1. Call the parent class' setId method and pass in lastEntry as the method variable;
	}

	/**
	 * This method returns the title of the question
	 *
	 * @return the title of the question
	 */
	//code below show the getTitle method.
	public String getTitle() {
		// please write your code here
		// you should return the instance variable title of this question
		return title;
	}


	/**
	 * This method sets the title of the question
	 *
	 * @param title: the title that we want to give to this question
	 */
	//setTitle method for setting a title which is declared as private.
	public void setTitle(String title) {
		// please write your code here
		// Set the instance variable title to the parameter variable title
		this.title = title;
	}

	/**
	 * This method returns the details of this question
	 *
	 * @return details of the question
	 */
	//getMessage for the private variable message.
	public String getMessage() {
		// please write your code here
		// You should return the instance variable message of this question
		return message;
	}

	/**
	 * This method sets the message of the question
	 *
	 * @param message: the message that we want to set the details of this question to
	 */
	//setter method for variable message.
	public void setMessage(String message) {
		// please write your code here
		// you should set the instance variable message to the parameter variable message
		this.message = message;
	}

	/**
	 * This method returns the user who wrote this question
	 *
	 * @return user who wrote this question
	 */
	// getter for user variable
	public User getUser() {
		// please write your code here
		// You should return the instance variable user of this question
		return user;
	}

	/**
	 * This method sets the user who wrote this question
	 *
	 * @param user: the user who wrote this question
	 */
	//setter for private variable user.
	public void setUser(User user) {
		// please write your code here
		// You should set the instance variable user to the parameter variable user
		this.user = user;
	}

	/**
	 * This method returns the number of upvotes this question has received
	 *
	 * @return the number of upvotes this question has received
	 */
	//getter for private upvoteCount variable
	public int getUpvoteCount() {
		// please write your code here
		// You should return the instance variable upvoteCount
		return upvoteCount;
	}

	/**
	 * This question increases the number of upvotes by one
	 */
	// it increases upvotes.
	public void increaseUpvoteCount() {
		// write your code here
		// Increase the number stored in the instance variable upvoteCount by 1
		upvoteCount = upvoteCount+1;
	}

}

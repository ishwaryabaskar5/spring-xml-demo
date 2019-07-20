package com.stackroute.domain;

public class Movie {

//	declaration
	private Actor actor;
	
//  constructor
	public Movie() {
	}
	
	public Movie(Actor actor) {
		this.actor = actor;
	}
	
//	getter and setter
	public Actor getActor() {
		return actor;
	}
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
//	display actor info
	public void display()
	{
		System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+" Age: "+actor.getAge() );
	}
}

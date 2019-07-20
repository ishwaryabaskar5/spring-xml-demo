package com.stackroute.domain;

public class Movie {

//  declaration
	private Actor actorObj;
	
//	constructor
	public Movie() {
	}
	
	public Movie(Actor actorObj) {
		this.actorObj = actorObj;
	}
	
//	getter and setter
	public Actor getActorObj() {
		return actorObj;
	}
	
	public void setActorObj(Actor actorObj) {
		this.actorObj = actorObj;
	}
	
//	display actor info
	public void display()
	{
		System.out.println("Actor Name: "+ actorObj.getName()+" Gender: "+ actorObj.getGender()+" Age: "+ actorObj.getAge() );
	}
}

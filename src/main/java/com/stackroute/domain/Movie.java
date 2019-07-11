package com.stackroute.domain;

public class Movie {
	
	private Actor actorObj;
	
	public Movie() {
	}
	
	public Movie(Actor actorObj) {
		this.actorObj = actorObj;
	}
	
	public Actor getActorObj() {
		return actorObj;
	}
	
	public void setActorObj(Actor actorObj) {
		this.actorObj = actorObj;
	}
	
	public void display()
	{
		System.out.println("Actor Name: "+ actorObj.getName()+" Gender: "+ actorObj.getGender()+" Age: "+ actorObj.getAge() );
	}
}

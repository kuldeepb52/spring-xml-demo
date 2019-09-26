package com.stackroute.domain;

public class Movie {
    private Actor actorObj;
    public Movie(Actor actorObj) {
        this.actorObj = actorObj;
    }

    public void getActorDetails(){
         actorObj.getDetails();
    }
}

package com.stackroute.domain;

public class Movie {
    private Actor actorObj;

    public void setActorObj(Actor actorObj) {
        this.actorObj = actorObj;
    }

    public void getActorDetails(){
        actorObj.getDetails();
    }
}

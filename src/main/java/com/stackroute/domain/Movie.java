package com.stackroute.domain;

public class Movie {
    private Actor actorBean;

    public Movie(Actor actorBean) {
        this.actorBean = actorBean;
    }




    public void getActorDetails(){
         actorBean.getDetails();
    }


}

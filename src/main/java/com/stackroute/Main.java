package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext getMovieObj=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=getMovieObj.getBean("movieBean",Movie.class);
        movie.getActorDetails();
        Movie movie1=getMovieObj.getBean("movieBean1",Movie.class);
        movie1.getActorDetails();
        System.out.println(movie==movie1);
    }

}

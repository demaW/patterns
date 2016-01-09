package com.epam.patterns.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        MovieSession movieSession = new MovieSession();

        movieSession.setMovie(new Movie("Interstellar", "2h 10m", 9));
        movieSession.setHall(new Hall(1, "redHall"));
        movieSession.setSessionTime(new SessionTime(2016, 1, 12, 13, 30));

        MovieSession movieSession2 = (MovieSession) movieSession.clone();
        movieSession2.setHall(new Hall(2, "blueHall"));
        System.out.println("Hashcode of movieSession.getHall" + System.identityHashCode(movieSession.getHall()));
        System.out.println();
        System.out.println("Hashcode of movieSession2.getHall" + System.identityHashCode(movieSession2.getHall()));

        System.out.println("changing value of movieSession ");
        movieSession.setHall(new Hall(3, "yellowHall"));

        System.out.println("Hashcode of movieSession.getHall" + System.identityHashCode(movieSession.getHall()));
        System.out.println();
        System.out.println("Hashcode of movieSession2.getHall" + System.identityHashCode(movieSession2.getHall()));
    }
}

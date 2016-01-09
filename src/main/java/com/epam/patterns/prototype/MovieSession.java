package com.epam.patterns.prototype;

public class MovieSession extends PrototypeCapable {

    private Movie movie;
    private Hall hall;
    private SessionTime sessionTime;

    public MovieSession() {
    }

    public MovieSession(Movie movie, Hall hall, SessionTime sessionTime) {
        this.movie = movie;
        this.hall = hall;
        this.sessionTime = sessionTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public SessionTime getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(SessionTime sessionTime) {
        this.sessionTime = sessionTime;
    }

    @Override
    public PrototypeCapable clone() {
        MovieSession copy = new MovieSession(this.getMovie(),this.getHall(),this.getSessionTime());
        return copy;
    }
}

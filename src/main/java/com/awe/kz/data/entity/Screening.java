package com.awe.kz.data.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "SCREENING")
public class Screening implements Cloneable {
    @Id
    @Column(name = "SCREENING_ID")
    @SequenceGenerator(name = "screening_gen", sequenceName = "screening_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_gen")
    private long screeningId;
    @Column(name = "THEATRE_ID")
    private long theatreId;
    @Column(name = "SCREEN_ID")
    private long screenId;
    @Column(name = "MOVIE_NAME")
    private String movieName;
    @Column(name = "SCREENING_DATE")
    private LocalDate screeningDate;
    @Column(name = "SCREENING_TIME")
    private LocalTime screeningTime;
    @Column(name = "BOOKED_TICKETS")
    private int bookedTickets;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(int bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(long screeningId) {
        this.screeningId = screeningId;
    }

    public long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(long theatreId) {
        this.theatreId = theatreId;
    }

    public long getScreenId() {
        return screenId;
    }

    public void setScreenId(long screenId) {
        this.screenId = screenId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDate getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(LocalDate screeningDate) {
        this.screeningDate = screeningDate;
    }

    public LocalTime getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(LocalTime screeningTime) {
        this.screeningTime = screeningTime;
    }
}

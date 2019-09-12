package com.awe.kz.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "SCREEN")
public class Screen {
    @Id
    @Column(name = "SCREEN_ID")
    @SequenceGenerator(name = "screen_gen", sequenceName = "screen_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screen_gen")
    private long screenId;
    @Column(name = "THEATRE_ID")
    private long theatreId;
    @Column(name = "SEATS_NUM")
    private int seatsNum;

    public long getScreenId() {
        return screenId;
    }

    public void setScreenId(long screenId) {
        this.screenId = screenId;
    }

    public long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(long theatreId) {
        this.theatreId = theatreId;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }
}

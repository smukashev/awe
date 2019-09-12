package com.awe.kz.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "SEAT")
public class Seat {
    @Id
    @Column(name = "SEAT_ID")
    @SequenceGenerator(name = "seat_gen", sequenceName = "seat_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_gen")
    private Long seat_id;
    @Column(name = "ROW_ID")
    private char row_id;
    @Column(name = "ROW_NUMBER")
    private Integer row_number;
    @Column(name = "SCREEN_ID")
    private Long screen_id;

    public long getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(long seat_id) {
        this.seat_id = seat_id;
    }

    public char getRow_id() {
        return row_id;
    }

    public void setRow_id(char row_id) {
        this.row_id = row_id;
    }

    public int getRow_number() {
        return row_number;
    }

    public void setRow_number(int row_number) {
        this.row_number = row_number;
    }

    public long getScreen_id() {
        return screen_id;
    }

    public void setScreen_id(long screen_id) {
        this.screen_id = screen_id;
    }
}

package com.awe.kz.data.entity;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @Column(name = "TICKET_ID")
    @SequenceGenerator(name = "ticket_gen", sequenceName = "ticket_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_gen")
    private long ticketId;
    @Column(name = "SCREENING_ID")
    private long screeningId;
    @Column(name = "SEAT_NUM")
    private int seatNum;

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(long screeningId) {
        this.screeningId = screeningId;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
}

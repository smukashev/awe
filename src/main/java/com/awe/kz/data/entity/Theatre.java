package com.awe.kz.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "THEATRE")
public class Theatre {
    @Id
    @Column(name = "THEATRE_ID")
    @SequenceGenerator(name = "theatre_gen", sequenceName = "theatre_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "theatre_gen")
    private long theatreId;
    @Column(name = "THEATRE_NAME")
    private String theatreName;
    @Column(name = "THEATRE_CITY")
    private String theatreCity;

    public long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(long theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreCity() {
        return theatreCity;
    }

    public void setTheatreCity(String theatreCity) {
        this.theatreCity = theatreCity;
    }
}

package com.eldar.flightreservation.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
public class Flight extends AbstractEntity{
    private String flightNumber;
    private String operatingAirlines;
    private String departureCity;
    private String arrivalCity;
    private Date dateOfDeparture;
    private Timestamp estimatedDepartureTime;
}

package com.tripsdev.BoatTrips.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {
    private Long id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int numOfChildrens;

    private int numOfAdults;

    private int numOfSeniors;

    private int totalNumOfGuests;

    private String bookingConfirmationCode;

    private UserDTO user;

    private RoomDTO room;
}

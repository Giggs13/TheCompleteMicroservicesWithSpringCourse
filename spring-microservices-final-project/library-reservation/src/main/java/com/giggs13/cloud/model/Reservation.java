package com.giggs13.cloud.model;

import lombok.Data;

import java.util.Date;

@Data
public class Reservation {

    private int reservationId;
    private String username;
    private int bookId;
    private Date date;
}

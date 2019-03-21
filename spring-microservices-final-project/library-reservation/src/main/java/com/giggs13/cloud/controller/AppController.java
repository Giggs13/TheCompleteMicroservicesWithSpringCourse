package com.giggs13.cloud.controller;

import com.giggs13.cloud.model.Reservation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class AppController {

    @Value("${server.port}")
    private String port;
    private Map<Integer, Reservation> reservations = new HashMap<>();

    @RequestMapping("/reservation/user/{username}/book/{bookId}")
    @CrossOrigin
    public String reserve(@PathVariable("username") String username,
                          @PathVariable("bookId") int bookId) {
        Reservation reservation = new Reservation();
        reservation.setBookId(bookId);
        reservation.setUsername(username);
        reservation.setDate(new Date());
        reservation.setReservationId(new Random().nextInt(100));
        reservations.put(reservation.getReservationId(), reservation);
        System.out.println(reservations.size());

        return "Title has been reserved using server on port: " + port + ".";
    }

    @RequestMapping("/reservation/user/{username}")
    @CrossOrigin
    public List<Reservation> reservationsByUser(@PathVariable("username") String username) {
        List<Reservation> tmpReservations = new ArrayList<Reservation>();
        for (Reservation reservation : this.reservations.values()) {
            if (reservation.getUsername().equals(username)) {
                tmpReservations.add(reservation);
            }
        }

        return tmpReservations;
    }
}

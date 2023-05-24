package com.coherent.hotel.service;

import com.coherent.hotel.entity.Reservation;

import java.util.Set;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Set<Reservation> getAllReservation();
    Reservation updateReservation(Reservation reservation);
    Boolean deleteReservation(Reservation reservation);
}

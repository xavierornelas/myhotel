package com.coherent.hotel.repository;

import com.coherent.hotel.entity.Reservation;

import java.util.Set;

public interface IReservationRepository {
    Boolean save(Reservation reservation);
    Set<Reservation> getAll();
    Boolean update(Reservation reservation);
    Boolean remove(Reservation reservation);
}

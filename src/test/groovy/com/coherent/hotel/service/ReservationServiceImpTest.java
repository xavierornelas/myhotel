package com.coherent.hotel.service;

import com.coherent.hotel.entity.Reservation;
import com.coherent.hotel.repository.IReservationRepositoryImp;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ReservationServiceImpTest {

    private IReservationRepositoryImp iReservationRepositoryImp = mock(IReservationRepositoryImp.class);
    private ReservationServiceImp reservationServiceImp = new ReservationServiceImp(iReservationRepositoryImp);

    @Test
    void addReservation() {
        Reservation reservation = Reservation.builder()
                .id(1)
                .clientFullName("Francisco xavier Ornelas")
                .roomNumber(2)
                .reservationDates(List.of(LocalDate.of(2023,05,01),LocalDate.of(2023,05,15)))
                .build();
        assertEquals(reservationServiceImp.addReservation(reservation),reservation);
    }
}
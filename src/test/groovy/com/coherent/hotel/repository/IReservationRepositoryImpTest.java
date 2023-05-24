package com.coherent.hotel.repository;

import com.coherent.hotel.entity.Reservation;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

class IReservationRepositoryImpTest {
    IReservationRepositoryImp iReservationRepositoryImp = new IReservationRepositoryImp();
    @Test
    void save() {
        Reservation reservation = Reservation.builder()
                .id(1)
                .clientFullName("Francisco xavier Ornelas")
                .roomNumber(2)
                .reservationDates(List.of(LocalDate.of(2023,05,01),LocalDate.of(2023,05,15)))
                .build();
        assertEquals(this.iReservationRepositoryImp.save(reservation),true);
    }
}
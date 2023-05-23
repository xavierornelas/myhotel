package com.coherent.hotel.repository;

import com.coherent.hotel.entity.Reservation;
import com.coherent.hotel.registry.HotelDB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Slf4j
@Repository
public class IReservationRepositoryImp implements IReservationRepository{
    @Override
    public Boolean save(Reservation reservation) {
        return HotelDB.persistData.add(reservation);
    }

    @Override
    public Set<Reservation> getAll() {
        return HotelDB.persistData;
    }

    @Override
    public Boolean update(Reservation reservation) {
        return HotelDB.persistData.add(reservation);
    }
}

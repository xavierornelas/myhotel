package com.coherent.hotel.service;

import com.coherent.hotel.entity.Reservation;
import com.coherent.hotel.exception.ReservationNotFound;
import com.coherent.hotel.registry.HotelDB;
import com.coherent.hotel.repository.IReservationRepositoryImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
@Slf4j
@Service
public class ReservationServiceImp implements IReservationService{
    @Autowired
    private IReservationRepositoryImp iReservationRepositoryImp;

    public ReservationServiceImp(){

    }

    public ReservationServiceImp(IReservationRepositoryImp iReservationRepositoryImp){
        this.iReservationRepositoryImp = iReservationRepositoryImp;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        log.info("Adding reservation: {}",reservation);
        iReservationRepositoryImp.save(reservation);
        log.info("Printing Set: {}", HotelDB.persistData);
        return reservation;
    }

    @Override
    public Set<Reservation> getAllReservation() {
        log.info("Returning reservation list: {}",HotelDB.persistData);
        return iReservationRepositoryImp.getAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        try{
            Reservation reservationTemp = findReservationById(reservation.getId());
            if(deleteReservation(reservationTemp)){
                iReservationRepositoryImp.update(reservation);
            }
        } catch (ReservationNotFound e){
            log.error("Reservation not found {}: ",e.getMessage());
            throw e;
        }
        return reservation;
    }

    @Override
    public Boolean deleteReservation(Reservation reservation) {
        log.warn("Deleting reservation: {}",reservation);
        return iReservationRepositoryImp.remove(reservation);
    }

    private Reservation findReservationById(Integer id) throws ReservationNotFound{
        Optional<Reservation> result = HotelDB.persistData.stream()
                .filter(item -> item.getId() == id)
                .findFirst();
        if(!result.isPresent())
            throw new ReservationNotFound();
        return result.get();
    }
}

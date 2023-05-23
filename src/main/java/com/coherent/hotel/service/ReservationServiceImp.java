package com.coherent.hotel.service;

import com.coherent.hotel.repository.IReservationRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImp {
    @Autowired
    private IReservationRepositoryImp iReservationRepositoryImp;


}

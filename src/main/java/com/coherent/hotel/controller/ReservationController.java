package com.coherent.hotel.controller;

import com.coherent.hotel.entity.Reservation;
import com.coherent.hotel.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/myhotel")
public class ReservationController {
    @Autowired
    private IReservationService iReservationService;

    @PostMapping("reservation")
    public ResponseEntity<Reservation>createReservation(@RequestBody Reservation reservation){
        return new ResponseEntity(this.iReservationService.addReservation(reservation), HttpStatus.CREATED);
    }

    @GetMapping("totalreservation")
    public ResponseEntity<Reservation>getListReservation(){
        return new ResponseEntity(this.iReservationService.getAllReservation(), HttpStatus.OK);
    }
}

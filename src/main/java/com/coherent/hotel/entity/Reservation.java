package com.coherent.hotel.entity;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Reservation {

    private Integer id;
    private String clientFullName;
    private Integer roomNumber;
    private List<LocalDate> reservationDates;

}

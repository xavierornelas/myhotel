package com.coherent.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "reservation not found")
public class ReservationNotFound extends RuntimeException{
}

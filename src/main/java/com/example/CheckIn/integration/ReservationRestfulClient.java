package com.example.CheckIn.integration;


import com.example.CheckIn.integration.dto.Reservation;

public interface ReservationRestfulClient {
	public Reservation findReservation(Long id);
	//public Reservation updateReservation(@RequestBody ReservationUpdateRequest reservation);
}

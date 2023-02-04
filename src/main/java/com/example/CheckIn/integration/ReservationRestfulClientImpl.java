package com.example.CheckIn.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.CheckIn.integration.dto.Reservation;
@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost8080/Flight/reservation/"+id,Reservation.class);
		return reservation;
	}
	

}
